import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task11_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("”кажите систему исчислени€, в которой будет представленно число:");
        int nSystem = scanner.nextInt();
        System.out.println("¬ведите число в " + nSystem + "-ой системе исчислени€, раздел€€ разр€ды символом _ :");
        String nSystemNumber = scanner.next();
        System.out.println("„исло " + nSystemNumber + " равно числу " + toDecimal(nSystem, nSystemNumber) + " в дес€тичной системе исчислени€.");
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
