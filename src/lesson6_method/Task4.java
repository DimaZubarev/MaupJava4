package lesson6_method;

public class Task4 {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 3, 2, 1};
        System.out.println(isPalindrom(num));

    }
    static boolean isPalindrom(int[] num){
        if(num[0] == num[5] && num[1] == num[4] && num[2] == num[3]){
            return true;
        }else {return false;}

    }
}
