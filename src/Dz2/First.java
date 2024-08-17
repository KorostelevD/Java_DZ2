package Dz2;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Створення об'єкта Scanner для введення даних з консолі
        String yn; // Змінна для зберігання відповіді користувача
        do {
            System.out.println("Hello! please enter a number in the decimal system: ");
            int Number = scanner.nextInt();
            scanner.nextLine();// Очищення буфера перед зчитуванням рядка

            System.out.println("Hello! Please enter the number system (number from 2 to 16): ");
            int sysNumber = scanner.nextInt();

            if (sysNumber < 2 || sysNumber > 16) {
                while (sysNumber < 2 || sysNumber > 16) {
                    System.out.println("Error!Enter number from 2 to 16");
                    scanner.nextLine();// Очищення буфера перед зчитуванням рядка
                    sysNumber = scanner.nextInt();
                    if (sysNumber > 1 && sysNumber < 17) {
                        scanner.nextLine();// Очищення буфера перед зчитуванням рядка
                        //Перетворення числа в систему числення
                        String answer = Integer.toString(Number, sysNumber);
                        System.out.println("Число: " + Number + " у " + sysNumber + " системі: " + answer);
                    }
                }
            } else {
                scanner.nextLine();// Очищення буфера перед зчитуванням рядка
                //Перетворення числа в систему числення
                String answer = Integer.toString(Number, sysNumber);
                System.out.println("Число: " + Number + " у " + sysNumber + " системі: " + answer);

            }


            System.out.println("Exit, Yes/No");
            yn = scanner.nextLine();

        } while (!yn.equalsIgnoreCase("Yes")); // Умова виходу з циклу
    }
}