import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int earnings = 0;
        int spendings = 0;

        while (true) {
            System.out.println("Выберите операцию и введите ее номер:");
            System.out.println("1. Добавить новый доход");
            System.out.println("2. Добавить новый расход");
            System.out.println("3. Выбрать систему налогообложения");

            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }

            int operation = Integer.parseInt(input);

            switch (operation) {
                case 1:
                    System.out.println("Введите сумму дохода: ");
                    String moneyIn = scanner.nextLine();
                    int income = Integer.parseInt(moneyIn);
                    earnings += income;
                    break;
                case 2:
                    System.out.println("Введите сумму расхода: ");
                    String moneyOut = scanner.nextLine();
                    int expense = Integer.parseInt(moneyOut);
                    spendings += expense;
                    break;
                case 3:
                    int tax1 = calculateTax.calculateTaxEarnings(earnings);
                    int tax2 = calculateTax.calculateTaxEarningsMinusSpendings(earnings, spendings);
                    if (tax1 > tax2) {
                        System.out.println("Рекомендуется УСН доходы минус расходы");
                        System.out.println("Ваш налог составит: " + tax2 + " рублей");
                        System.out.println("Налог на другой системе: " + tax1 + " рублей");
                        System.out.println("Экономия: " +  (tax1 - tax2) + " рублей");
                    } else if (tax2 > tax1) {
                        System.out.println("Рекомендуется УСН доходы");
                        System.out.println("Ваш налог составит: " + tax1 + " рублей");
                        System.out.println("Налог на другой системе: " + tax2 + " рублей");
                        System.out.println("Экономия: " +  (tax2 - tax1) + " рублей");
                    } else {
                        System.out.println("Можете выбрать любую систему налогообложения");
                        System.out.println("Ваш налог составит: " + tax1 + " рублей");
                    }
                    break;
                default:
                    System.out.println("Такой операции нет");
            }
        }

    }
    public class calculateTax {
        public static int calculateTaxEarnings(int earnings) {
            int tax = (earnings)*6/100;
            if (tax >=0) {
                return tax;
            } else {
                return 0;
            }
        }
        public static int calculateTaxEarningsMinusSpendings(int earnings, int spendings) {
            int tax = (earnings - spendings)*15/100;
            if (tax >=0) {
                return tax;
            } else {
                return 0;
            }
        }
    }
}