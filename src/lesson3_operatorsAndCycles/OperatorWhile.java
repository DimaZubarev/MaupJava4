package lesson3_operatorsAndCycles;

import java.util.Scanner;

public class OperatorWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        while (i > 0) {
            System.out.println(i);
            i--;
        }
    }
}
