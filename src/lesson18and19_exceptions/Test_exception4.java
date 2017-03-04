package lesson18and19_exceptions;

import java.util.Scanner;
public class Test_exception4 {
    public static void main(String[] args) {
        String inputA;
        String inputB;
        int a = 0;
        int b = 0;
        boolean ok = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("a = ");
        do {
            inputA = sc.next();
            try {
                a = Integer.parseInt(inputA);    // parse... -приводит строку к нужному значению (INT, Double, Long і тд)
                ok = true;
            } catch (NumberFormatException e) {
                System.out.println("Try again!");
            }
        } while (!ok);

        System.out.println("b = ");
        do {
            inputB = sc.next();
            try {
                b = Integer.parseInt(inputB);
                System.out.println("a/b = " + a/b);
            } catch (ArithmeticException e) {
                System.out.println("a/b = Infinity");
            }
        } while (true);
    }
}
