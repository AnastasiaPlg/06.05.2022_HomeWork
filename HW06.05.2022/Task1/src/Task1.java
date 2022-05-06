import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цену товара А:");
        double priceA = scanner.nextDouble();
        System.out.println("Введите цену товара Б:");
        double priceB = scanner.nextDouble();

        System.out.println("Задание 1а: " + taskA(priceA, priceB));
        System.out.println("Задание 1б: " + taskB(priceA, priceB));
        System.out.println("Задание 1в: " + taskC(priceA, priceB));

    }

    public static double taskA (double xx, double yy) {
        int coinsNumberProductA = (int) (xx * 100);
        int coinsNumberProductB = (int) (yy * 100);
        double saleA = 0.15;
        int coinsFinalPriceProductA = (int)((1 - saleA) * coinsNumberProductA);
        int coinsFinalCost = 10 * coinsFinalPriceProductA + 2 * coinsNumberProductB;
        double finalPrice = (double)coinsFinalCost / 100;
        return finalPrice;
    }

    public static double taskB (double xx, double yy) {
        int coinsNumberProductA = (int) (xx * 100);
        int coinsNumberProductB = (int) (yy * 100);
        double saleA = 0.5;
        int coinsFinalPriceProductA = (int)((1 - saleA) * coinsNumberProductA);
        int coinsFinalCost = 7 * coinsFinalPriceProductA + 1 * coinsNumberProductB;
        double finalPrice = (double)coinsFinalCost / 100;
        return finalPrice;
    }

    public static double taskC (double xx, double yy) {
        int coinsNumberProductA = (int) (xx * 100);
        int coinsNumberProductB = (int) (yy * 100);
        double saleA = 0.1;
        int coinsFinalPriceProductA = (int)((1 - saleA) * coinsNumberProductA);
        int coinsFinalCost = 2 * coinsFinalPriceProductA + 3 * coinsNumberProductB;
        double finalPrice = (double)coinsFinalCost / 100;
        return finalPrice;
    }
}


