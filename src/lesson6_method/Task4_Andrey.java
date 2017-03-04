package lesson6_method;

public class Task4_Andrey {
    public static void main(String[] args) {
        System.out.println(isPalindrom(1234321));
    }
    static boolean isPalindrom(int n){
        char[] digits = Integer.toString(n).toCharArray(); // привидение числа к масиву
        int len = digits.length/2;
        for (int i = 0; i < len; i++) {
            if(digits[i] != digits[digits.length - 1 - i]) return false;
            // digits[i] - идет на увиличение,
            // а digits[digits.length - 1 - i] идет на уменьшение.
        }
        return true;
    }
}
