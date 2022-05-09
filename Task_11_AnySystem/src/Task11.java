import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task11 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число в десятичной системе исчисления:");
            int decimalNumber = scanner.nextInt();
            System.out.println("Укажите желаемую систему исчисления для перевода:");
            int nSystem = scanner.nextInt();
            System.out.println("Десятичное число " + decimalNumber + " равно числу " + toNSystem(nSystem, decimalNumber) + " в " + nSystem + "-ой системе исчисления.");
        }

        public static StringBuilder toNSystem(int n,int decimalNumber) {

            String nSystemNumber = "";
            String aNumber;
            while (decimalNumber > 0) {
                int a = decimalNumber % n;
                aNumber = Integer.toString(a) + "_";
                nSystemNumber = aNumber + nSystemNumber;
                decimalNumber = decimalNumber / n;
            }
            StringBuilder resultNumber = new StringBuilder(nSystemNumber);

            return resultNumber.deleteCharAt(resultNumber.length() - 1);
        }

    }

