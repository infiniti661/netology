import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Добро пожаловать в калькулятор расчёта таможенной пошлины!");
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите цену товара (в руб.): ");
        int price = scanner.nextInt();
        System.out.print("Введите вес товара (в кг): ");
        int weight = scanner.nextInt();
        int tax = calculateCustoms(price, weight);
        System.out.println("Размер пошлины (в руб.) составит: " + tax);

    }

    public static int calculateCustoms(int price, int weight) {
        int result = price / 100 + weight * 100;
        return result;
    }
}