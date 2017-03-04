package lesson4_arrays;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int[] number1 = new int[10];
        int[] number2 = {1, 2, 3, 4, 5};
        int[] number3;
        number3 = new int[]{1, 2, 3, 4, 5};

        System.out.println(number2);                  // дає ссилку на масив
        System.out.println(Arrays.toString(number2)); // роздруковує масив


    }
}
