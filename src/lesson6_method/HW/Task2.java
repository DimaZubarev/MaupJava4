package lesson6_method.HW;

public class Task2 {
    public static void main(String[] args) {
        int[]num = {10, 35, 5874, 19746, 48, -58, -378, 49, -3, 20};
        System.out.println(sumNegative(num));
        System.out.println(sumPositiv(num));
        System.out.println(bigNum(num));
    }
    static int sumNegative(int[] num){
        int result = 0;
        for (int i : num) {
            if (i<0){
                 result += i;
            }
        }
        return result;
    }
    static int sumPositiv(int[] num){
        int result = 0;
        for (int i : num) {
            if(i > 0){
                result += i;
            }
        }
        return result;
    }
    static int bigNum(int[] num){
        int result = 0;
        for (int i : num) {
            if(i >= 10000){
                result +=i;
            }
        }
        return result;
    }
}
