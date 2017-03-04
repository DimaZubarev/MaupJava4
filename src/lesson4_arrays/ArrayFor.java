package lesson4_arrays;

import java.util.Arrays;

public class ArrayFor {
    public static void main(String[] args) {
        int[] number = new int[10];
        // заповнення масива
        for (int i = 0; i < number.length; i++) {
            number[i] = i;
        }
        // вивод масива
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
        // копіювання масива
        int[] numberCopy = new int[number.length];
        for (int i = 0; i < number.length; i++) {
            numberCopy[i] = number[i];
        }
        System.out.println(Arrays.toString(numberCopy));
    }


}
