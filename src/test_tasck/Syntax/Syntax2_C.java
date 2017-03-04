package test_tasck.Syntax;

public class Syntax2_C {
    public static void main(String[] args) {
        String str1 = "Hello World !";

        System.out.println(lastSpace(str1));
    }

    // видалення останнього пробілу
    static StringBuilder lastSpace(String input){
       StringBuilder sb = new StringBuilder("Hello World !");
       int index;
       index = sb.lastIndexOf(" ");
       return sb.deleteCharAt(index);

    }
}
