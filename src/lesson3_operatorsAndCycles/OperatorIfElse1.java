package lesson3_operatorsAndCycles;

import java.util.Scanner;

public class OperatorIfElse1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.println("Input A");
        a = sc.nextInt();                // ввод с калвиатуры
        System.out.println("Input B");
        b = sc.nextInt();

        if(a < b) {
            System.out.println("a < b");
        } else {
            if(a > b) {
                System.out.println("a > b");
            } else {
                System.out.println("a == b");
            }
        }
    }
}
