import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int number1 = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int number2 = scanner.nextInt();
        String result = divisionOfNumbers (10, 3);
        System.out.println(number1 + " : " + number2 + " = " + result);
    }

    private static String divisionOfNumbers (int q, int w) {
        int wholePart = q / w;
        int remainder = q % w;
        return String.format("%1$d (остаток %2$d)", wholePart, remainder);
    }

}
