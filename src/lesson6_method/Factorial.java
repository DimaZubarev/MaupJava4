package lesson6_method;

public class Factorial {
    public static void main(String[] args) {
 //     int n =3;
        System.out.println(factorial(12));
        System.out.println(CnK1(20, 5));
        System.out.println(CnK2(36, 5));
    }
    static long factorial(int n){
        long fact = 1;
        for (int i = 2; i < n; i++) {
            fact*=i;
        }
        return fact;
    }
    static long CnK1(int n, int k){
        return factorial(n) / (factorial(k) * factorial(n - k));
    }

    static long CnK2(int n, int k){
        long result = 1;
        for (int i = n-k+1; i <= n; i++) {
            result *= i;
        }
        return result / factorial(k);
    }
}
