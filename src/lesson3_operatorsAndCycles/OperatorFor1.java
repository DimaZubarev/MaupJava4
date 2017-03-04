package lesson3_operatorsAndCycles;

import java.util.Scanner;

public class OperatorFor1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(n);
        }
        int i = 0;
        for (;i <= n;) {
            System.out.println(i);
            i++;
        }
    }

}
