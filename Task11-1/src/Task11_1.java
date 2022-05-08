import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task11_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите систему исчисления, в которой будет представленно число (в формате числа от 2 до 36):");
        int nSystem = scanner.nextInt();
        System.out.println("Введите число в " + nSystem + "-ой системе исчисления:");
        String nSystemNumber = scanner.next();
        System.out.println("Число " + nSystemNumber + " равно числу " + toDecimal(nSystem, nSystemNumber) + " в десятичной системе исчисления.");
    }

    public static int toDecimal(int n, String nSystemNumber) {

        List<Character> charList = new ArrayList<>();
        for (int i = 48; i <= 57; i++) {
            charList.add((char) i);
        }
        for (int i = 65; i <= 90; i++) {
            charList.add((char) i);
        }

        int demNum = 0;
        char[] arrayCharNum = nSystemNumber.toCharArray();
        int[] arrayNum = new int[nSystemNumber.length()];
        for (int i = 0; i < nSystemNumber.length(); i++) {
            for (int j = 0; j < charList.size(); j++) {
                if (arrayCharNum[i] == charList.get(j)) {
                    arrayNum[i] = j;
                }
            }
        }
            for (int i = 0; i < nSystemNumber.length(); i++) {
                demNum = n * demNum + arrayNum[i];
            }
            return demNum;


    }
}
