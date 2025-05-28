import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        while (true) {
            System.out.print("Введите год: ");
            int year = scanner.nextInt();

            System.out.print("Введите количество дней: ");
            int days = scanner.nextInt();

            int correctDays = isLeapYear(year) ? 366 : 365;

            if (days == correctDays) {
                score++;
            } else {
                System.out.println("Неправильно! В этом году " + correctDays + " дней!");
                break;
            }
        }

        System.out.println("Набрано очков: " + score);

        scanner.close();
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
