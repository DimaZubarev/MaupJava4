package lesson4_arrays;

import java.util.Arrays;

public class Array2D {
    public static void main(String[] args) {
        int[][] num = new int[3][4];
        System.out.println(Arrays.toString(num));
        System.out.println(" ");
//        num[1][2] = 5;
//        System.out.println(Arrays.toString(num[0]));
//        System.out.println(Arrays.toString(num[1]));
//        System.out.println(Arrays.toString(num[2]));

        // var1
        int n = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = ++n;
            }
        }
        for (int[] line : num) {
            System.out.println(Arrays.toString(line));
        }
        System.out.println(" ");
        //va2
        System.out.println(Arrays.deepToString(num)); // тільки для двумірних масивів, для тримірних вже не працює
    }
}
