package lesson11_oop5_polymorhysm.stringBuilder;

import java.util.Arrays;

public class StringBuilderMain {
    public static void main(String[] args) {
        String s = "Hello from Java";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb);
        System.out.println("sb[0]= " + sb.charAt(0));
        sb.setCharAt(11, 'j');
        System.out.println(sb);

        char[] chars = new char[5];
        sb.getChars(0,5, chars, 0);
        System.out.println(Arrays.toString(chars));

        sb.append("!");
        System.out.println(sb);

        sb.insert(sb.length()-1, " courses");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
        sb.reverse();

//        sb.deleteCharAt(sb.length() - 1);
//        System.out.println(sb);
        sb.delete(sb.length() - 2, sb.length());
        System.out.println(sb);

        sb.replace(11, 15, "Scala");
        System.out.println(sb);


    }


}
