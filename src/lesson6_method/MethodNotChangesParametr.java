package lesson6_method;

import java.util.Arrays;

public class MethodNotChangesParametr {
    public static void main(String[] args) {
        int[] a = {3, 5, 7, 1, 4, 2, 8, 6};
        System.out.println(Arrays.toString(a));
        int[] b = getSorted(a);
        System.out.println(Arrays.toString(a));
        System.out.println("b = " + Arrays.toString(b));
    }
    static int[] getSorted(int[]a){
        int[] copy = Arrays.copyOfRange(a, 0, a.length);
        Arrays.sort(copy);
        return copy;
    }
}
