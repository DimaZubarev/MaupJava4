package lesson6_method;

import java.util.Scanner;

public class Task3_me {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(even(n));
    }
    static boolean even(int n){
        if (n%2 == 0){
            return true;
        }else {return false;}
    }
}
