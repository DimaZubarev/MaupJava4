package lesson4_arrays.hw;

import java.util.Arrays;
import java.util.Scanner;

public class Task4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        int[] num1, num2;

        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        num1 = Arrays.copyOfRange(num, 0, num.length/2);     // ця функц копіює з одного в інший (масив, з відки, по який)
        num2 = Arrays.copyOfRange(num, num.length/2, num.length);

        Arrays.sort(num1);
        Arrays.sort(num2);

        System.out.println(Arrays.toString(num1));
        System.out.println(Arrays.toString(num2));

    }
}
