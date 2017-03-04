package test_tasck.Syntax;

import java.util.Arrays;
import java.util.Scanner;

public class Syntax1_C {
    public static void main(String[] args) {
        // Заповнюю вручну масив
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[10];
        for (int i = 0; i < num.length; i++) {
            num[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(num));
        System.out.println(min(num));
        System.out.println(max(num));
        splitArray(num);
        polSum(num);
    }

    // вивожу мінімум
    static int min(int[] num) {
        int min = num[0];
        for (int i : num) {
            if (i < min) min = i;
        }
        return min;
    }

    // вивожу максімум
    static int max(int[] num) {
        int max = num[0];
        for (int i : num) {
            if (i > max) max = i;
        }
        return max;
    }

    // вивожу два масива з парними та не парт
    static void splitArray(int[]num){
        int[] evenNum = new int[5];
        int[] oddNum = new int[5];
        int count1 = 0;
        int count2 = 0;
        for (int n : num) {
            if (n % 2 == 0) {
                evenNum[count1++] = n;
            } else {
                oddNum[count2++] = n;
            }
        }
            System.out.println(Arrays.toString(evenNum));
            System.out.println(Arrays.toString(oddNum));
    }

    // вивожу полусумму двух чисел
    static void polSum(int[] num){
        for (int i = 1; i < num.length -2 ; i++) {
            if(num[i] == ((num[i-1]+num[i+1])/2 )){
                System.out.print(num[i] + " ");
            }
        }
    }
}
// ctrl + alt + l - все виділяємо, а потім хоткеїм (привиде до нормального вигляду)
