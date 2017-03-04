package lesson3_operatorsAndCycles.hw;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Радіус круга = ");
        double radius = sc.nextDouble();
        System.out.println("Х = ");
        double x = sc.nextDouble();
        System.out.println("Y = ");
        double y = sc.nextDouble();
        boolean result;
        result = (x*x+y*y<= radius*radius);
        System.out.println(result);
    }
}
