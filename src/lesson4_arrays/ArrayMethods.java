package lesson4_arrays;

import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {
        int[] number = new int[10];
        // заповнюємо масив
        Arrays.fill(number, 1);
        System.out.println(Arrays.toString(number));

        // копіювання масива
        // 1вар
        int[] numberCopy = new int[number.length];
        System.arraycopy(number, 0, numberCopy, 0, number.length/2);
        System.out.println(Arrays.toString(numberCopy));
        //2 вар
        int[] numberCopy2 = Arrays.copyOfRange(number, 0, number.length/2);
        System.out.println(Arrays.toString(numberCopy2));

        //
        int[] num = new int[10];
        for (int i = 0; i < number.length; i++) {
            num[i] = (int) (Math.random()*number.length*10+1);
        }
        System.out.println("До сортування: " + Arrays.toString(num));
        Arrays.sort(num);
        System.out.println("Після сортування" + Arrays.toString(num));



    }
}
