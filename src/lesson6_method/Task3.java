package lesson6_method;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(isPrime(101));

    }
    static boolean isPrime(int n){
        int count = 0;
        int m = (int)Math.sqrt(n);
        if(n%2 == 0) return false;
        for (int i = 3; i <= m; i+=2) {
            count++;
            if(n % i == 0) return false;
        }
        System.out.println(count);
        return true;
    }
}
