package Dz2;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Створення об'єкта Scanner для введення даних з консолі
        String yn; // Змінна для зберігання відповіді користувача
        long newNumber;

        //цикл
        do {
            System.out.println("Hello! please enter First number in 2, 8, 10 or 16 number system: ");
            String First = scanner.nextLine(); //введеня першого числа

            //перетворення числа в десяткову систему
            System.out.println("Please enter Number System of First number (2, 8, 10, 16) : ");
            int systemFirst = scanner.nextInt(); //введення системи числення для першого числа
            //якщо
            if (systemFirst != 2 && systemFirst != 8 && systemFirst != 10 && systemFirst != 16) {
                while (true) {
                    System.out.println("Error! Enter 2 or 8 or 10 or 16");
                    systemFirst = scanner.nextInt();
                    if (systemFirst == 2 || systemFirst == 8 || systemFirst == 10 || systemFirst == 16) {
                        //Перетворення числа в систему числення
                        newNumber = Long.parseLong(First,systemFirst);
                        System.out.println("Number " + First + " in decimal system is: " + newNumber);
                        System.out.println("_________________________________________________________ ");
                        break; //вихід з циклу
                    }
                }
            }else {
                newNumber = Long.parseLong(First,systemFirst);
                System.out.println("Number " + First + " in decimal system is: " + newNumber);
                System.out.println("____________________________________________________________________");
            }

            //переводимо з десяткової системи в НОВУ
            System.out.println("Please enter the NEW number system (2, 8, 10 or 16) for decimal number: " + newNumber);
            int sysNew = scanner.nextInt();
            if (sysNew != 2 && sysNew != 8 && sysNew != 10 && sysNew != 16) {
                while (true) {
                    System.out.println("NEW error! Enter 2 or 8 or 10 or 16");
                    sysNew = scanner.nextInt();
                    if (sysNew == 2 || sysNew == 8 || sysNew == 10 || sysNew == 16) {
                       //Перетворення числа в нову систему числення
                        String answer = Long.toString(newNumber, sysNew);
                        System.out.println("Decimal number " + newNumber + " in " + sysNew + " system is: " + answer);
                        break;
                    }
                }
            } else {
                //Перетворення числа в систему числення
                String answer = Long.toString(newNumber, sysNew);
                System.out.println("Decimal number " + newNumber + " in " + sysNew + " system is: " + answer);
            }

            System.out.println("Exit, Yes/No");
            scanner.nextLine();
            yn = scanner.nextLine();
        } while (!yn.equalsIgnoreCase("Yes")); // Умова виходу з циклу
    }
}