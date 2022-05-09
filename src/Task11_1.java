import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task11_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите систему исчисления, в которой будет представленно число:");
        int nSystem = scanner.nextInt();
        System.out.println("Введите число в " + nSystem + "-ой системе исчисления, разделяя разряды символом _ :");
        String nSystemNumber = scanner.next();
        System.out.println("Число " + nSystemNumber + " равно числу " + toDecimal(nSystem, nSystemNumber) + " в десятичной системе исчисления.");
    }

    public static int toDecimal(int n, String nSystemNumber) {
        int demNum = 0;
        String[] arrayStr = nSystemNumber.split("_");
        int[] arrayNum = new int[arrayStr.length];
        for (int i = 0; i < arrayNum.length; i++) {
                  arrayNum[i] = Integer.parseInt(arrayStr[i]);
                }


            for (int i = 0; i < arrayStr.length; i++) {
                demNum = n * demNum + arrayNum[i];
            }
            return demNum;


    }
}
