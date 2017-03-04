package lesson6_method;

public class MethodTest {
    static int sum(int a, int b){
        return a+b;
    }
    static void printSum(int a, int b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        int a = 4, b = 5;
        int c = sum(a, b);
        System.out.println(c);

        printSum(a,b);
    }

}

