package lesson3_operatorsAndCycles;

import java.util.Scanner;

public class OperatorIfElse2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Input A");
        a = sc.nextInt();
        System.out.println("Input B");
        b = sc.nextInt();
        c = (a > b) ? a:b;
        System.out.println("C = " + c);

    }
}
