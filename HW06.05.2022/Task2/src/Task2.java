import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите стоимость товара А:");
        double priceA = scanner.nextDouble();
        System.out.println("Введите стоимость товара Б:");
        double priceB = scanner.nextDouble();
        double discount = 0.1;
        double sumPriceWithDiscount = (1 - discount) * (priceA + priceB);
        System.out.printf(String.format("Стоимость покупки со скидкой: %.2f руб.", sumPriceWithDiscount));
        System.out.println();
        System.out.printf(String.format("Размер скидки: %.2f руб.", discount * (priceA + priceB)));
    }
}
