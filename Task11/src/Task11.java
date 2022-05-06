import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число в десятичной системе исчисления:");
        int decimalNumber = scanner.nextInt();
        System.out.println("Укажите желаемую систему исчисления для перевода (в формате числа от 2 до 36):");
        int nSystem = scanner.nextInt();
        System.out.println("Десятичное число " + decimalNumber + " равно числу " + toNSystem(nSystem, decimalNumber) + " в " + nSystem + "-ой системе исчисления.");
    }

    public static String toNSystem(int n,int decimalNumber) {
        List<Character> charList = new ArrayList<>();
        for (int i = 48; i <= 57; i++) {
        charList.add((char)i);
        }
        for (int i = 65; i <=90 ; i++) {
            charList.add((char)i);
        }
            String nSystemNumber = "";
            while (decimalNumber > 0) {
                int a = decimalNumber % n;
                char aChar = charList.get(a);
                nSystemNumber = aChar + nSystemNumber;
                decimalNumber = decimalNumber / n;
            }
            return nSystemNumber;
        }

}
