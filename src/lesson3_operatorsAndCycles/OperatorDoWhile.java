package lesson3_operatorsAndCycles;

import java.util.Scanner;

public class OperatorDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        do {
            System.out.println(i);
            i--;
        } while (i > 0);
    }
}
