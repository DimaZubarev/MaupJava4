package lesson4_arrays.hw;

import java.util.Arrays;
// Перевернуть масив с 1,2,3,4 на 4,3,2,1
public class Task4_2 {
    public static void main(String[] args) {
     int[]num = {1, 2, 3, 4};
     int tmp;
        System.out.println(Arrays.toString(num));
        for (int i = 0; i <num.length/2 ; i++) {
            tmp = num[i];
            num[i]= num[num.length-i-1];
            num[num.length-i-1] = tmp;
        }

        System.out.println(Arrays.toString(num));
    }
}
