package lesson6_method;

import java.util.Arrays;

public class MethodChangesParametr {
    public static void main(String[] args) {
        int[] a = {3, 5, 7, 1, 4, 2, 8, 6};
        System.out.println(Arrays.toString(a));
        mySort(a);
        System.out.println(Arrays.toString(a));
    }
    static void mySort (int[] b){
        Arrays.sort(b);
    }
}
