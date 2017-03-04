package lesson4_arrays.hw;

import java.util.Arrays;

public class Tasc4_1 {
    public static void main(String[] args) {
        int[] num = {1,5,2,9,11,4,7};
        int sum = 0;
        double average;
        int index = 0;
        double delta;
        double d;

        for (int i : num) {sum += i;}

        average =(double)sum/num.length;

        delta= Math.abs(num[index] - average);
        for (int i = 1; i < num.length; i++) {
            d = Math.abs(num[i] - average);
            if(d < delta){
                index = i;
                delta = d;
            }
        }
        System.out.println("sum = " + sum);
        System.out.println("average = " + average);
        System.out.println("is num [" + index + "] = " + num[index]);
    }
}
