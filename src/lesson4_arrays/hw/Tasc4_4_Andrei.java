package lesson4_arrays.hw;

import java.util.Arrays;
import java.util.Scanner;

public class Tasc4_4_Andrei {
    public static void main(String[] args) {
        int depth;
        Scanner scanner = new Scanner(System.in);
        depth = scanner.nextInt();

        int[][] a = new int[depth + 1][];

        for (int i = 0; i <= depth; i++) {
            a[i] = new int [i + 1];
            Arrays.fill(a[i], 1);
        }
        if (depth > 1){
            for (int i = 2; i <=depth; i++) {
                for (int j = 1; j < i; j++) {
                    a[i][j] = a[i-1][j-1] + a[i-1][j];
                }
            }
        }
        for (int i = 0; i < depth; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
