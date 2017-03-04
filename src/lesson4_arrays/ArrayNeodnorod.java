package lesson4_arrays;

import java.util.Arrays;

public class ArrayNeodnorod {
    public static void main(String[] args) {
        int[][] num = new int[8][];
        System.out.println(Arrays.deepToString(num));
        for (int i = 0; i <num.length ; i++) {
            num[i] = new int[i + 1];
            for (int j = 0; j <num[i].length ; j++) {
                num[i][j] = i + j + 1;
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(num));
    }
}
