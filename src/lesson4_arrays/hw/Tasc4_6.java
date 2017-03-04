package lesson4_arrays.hw;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Dimon on 02.12.2016.
 */
public class Tasc4_6 {
    public static void main(String[] args) {
        String inputStr = "$78?977kjbkjb";
        int ind1 = -1, ind2 = -1, ind3 = -1;
        char[] input = inputStr.toCharArray(); //
//      char[] input = "-78977kjbkjb".toCharArray();

        char[] digits = new char[input.length];
        char[] letters = new char[input.length];
        char[] others = new char[input.length];

        for (char c : input) {
            if (Character.isDigit(c)) {
                digits[++ind1] = c;
            }
            else if (Character.isLetter(c)) {
                letters[++ind2] = c;
            } else {
                others[++ind3] = c;
            }
        }
        for (int i = 0; i < ind1; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < ind2; i++) {
            System.out.print(letters[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < ind3; i++) {
            System.out.print(others[i] + " ");
        }

        // var1
//        String digits = "1234567890";
//        char c = '0';
//        if(digits.indexOf(Character.toString(c)) >= 0);
//        System.out.println("Ok");

    }
}
