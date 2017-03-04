package lesson4_arrays.hw;

import java.util.Scanner;

public class Task4_4 {
    public static void main(String[] args) {
        int lines = 0;
        System.out.println("Enter number of lines for Pascal Triangle:");
        // Reading
        Scanner sc = new Scanner(System.in);
        lines  = sc.nextInt();
        sc.close();
        // Calculation and print5
        int [][] p = new int [lines ][];
        p[0] = new int [1];
        p[1] = new int [2];
        p[1][0] = p[1][1] = 1;
        System.out.println(p[0][0] = 1);
        System.out.println(p[1][0] + " " + p[1][1]);
        for (int i = 2; i < lines ; i++)
        {
            p[i] = new int [i+1];
            System.out.print((p[i][0] = 1) + " ");
            for (int j = 1; j < i; j++)
            {
                System.out.print((p[i][j] = p[i-1][j-1] + p[i-1][j]) + " ");
            }
            System.out.println(p[i][i]=1);
        }
    }
}
