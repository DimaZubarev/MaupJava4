package lesson3_operatorsAndCycles.hw;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
//        int a = (int)(Math.random()*10 + 1);
//        int b = (int)(Math.random()*10 + 1);
//        int c = (int)(Math.random()*10 + 1);
//        int d = (int)(Math.random()*10 + 1);
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

//        int max1 = 0;
//        int max2 = 0;
//        int max3 = 0;
        int max = 0;

//        max1 = (a>b)?a:b;
//        max2 = (c>d)?c:d;
//        max3 = (max1>max2)?max1:max2;
        max = (((a>b)?a:b) > ((c>d)?c:d)) ? (a>b)?a:b : (c>d)?c:d;
        System.out.println("Max = " + max);





    }
}