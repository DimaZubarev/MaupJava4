package lesson4_arrays.hw;

import java.util.Arrays;

public class Task4_3 {
    public static void main(String[] args) {
        int[]num = new int[10];
        boolean isPaindrome = true;
        int len = num.length/2;

        for (int i = 0; i <num.length ; i++) {
            num[i] = (int)(Math.random()*10+1);
        }
        for (int i = 0; i < len; i++) {
            if(num[i] != num[num.length-i-1]){
                isPaindrome = false;
                break;
            }
        }
        System.out.println();

        System.out.println(Arrays.toString(num));

    }
}
