package lesson5;

public class Task5_4 {
    public static void main(String[] args) {
        String str1 = "cегодня прекрасный день";
        String str2 = str1.substring(19,23) + " прекрасный " + str1.substring(0,7);
        System.out.println(str1);
        System.out.println(str2);
    }
}
