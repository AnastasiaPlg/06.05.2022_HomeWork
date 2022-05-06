import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите натуральное число: ");
        int number = scanner.nextInt();
        System.out.println("Сумма цифр числа " + number + " равна " + findSum(number));

    }

    private static int findSum(int n) {
        int lengthOfNumber = (n + "").length();
        int sum = 0;
        for (int i = lengthOfNumber - 1; i >= 0; i--) {
        sum = sum + (n / (int)Math.pow(10, i));
        n = n % (int)Math.pow(10, i);
        }
        return sum;
    }

}
