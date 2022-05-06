import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цену товара А:");
        double priceA = scanner.nextDouble();
        System.out.println("Введите цену товара Б:");
        double priceB = scanner.nextDouble();

        System.out.println(taskA(priceA, priceB));
        System.out.println(taskB(priceA, priceB));
        System.out.println(taskC(priceA, priceB));

    }

    public static String taskA (double xx, double yy) {
        double discountA = 0.15;
        double finalPrice = 10 * ((1 - discountA) * xx) + 2 * yy;
        return String.format("Задание 1а: %.2f руб.", finalPrice);
    }

    public static String taskB (double xx, double yy) {
        double discountA = 0.5;
        double finalPrice = 7 * ((1 - discountA) * xx) + 1 * yy;
        return String.format("Задание 1б: %.2f руб.", finalPrice);
    }

    public static String taskC (double xx, double yy) {
        double discountA = 0.1;
        double finalPrice = 2 * ((1 - discountA) * xx) + 3 * yy;
        return String.format("Задание 1в: %.2f руб.", finalPrice);
    }
}


