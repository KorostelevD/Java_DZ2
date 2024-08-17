package Dz2;
import java.util.Scanner; //Додаю метод сканер

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Створення об'єкта Scanner для введення даних з консолі
        String yn; // Змінна для зберігання відповіді користувач

        do {
            System.out.println(" ");
            System.out.println("Hello, please enter the name of the Month: ");
            String month = scanner.nextLine().toLowerCase(); //введеня місяця, переводить все в нижній регістр
            //Новий Switch
            int days = switch (month) {
                case "january", "march", "may", "july", "august", "october", "december" -> 31;
                case "april", "june", "september", "november" -> 30;
                case "february" -> {
                    System.out.println("Is it a leap year? Yes/No");
                    String leapYearResponse = scanner.nextLine();
                    if (leapYearResponse.equalsIgnoreCase("Yes")) {
                        yield 29;
                    } else {
                        yield 28;
                    }
                }
                default -> {
                    System.out.println("Invalid month entered");
                    yield 0; // Повертає значення 0
                }
            };
            System.out.println("In " + month + " " + days + " days");
            System.out.println("___________________");
            System.out.println("Exit, Yes/No");
            // scanner.nextLine();
            yn = scanner.nextLine();
        } while (!yn.equalsIgnoreCase("Yes"));
    }
}
