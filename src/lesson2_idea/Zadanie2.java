package lesson2_idea;

/**
 * Created by Dimon on 29.11.2016.
 */
public class Zadanie2 {
    public static void main(String[] args) {
        String s1 = "super";
        String s2 = "sonic";
        String s3 = s1 + s2;
        String s4 = s1.substring(1,3); // считает от первой цифры включительно и ДО второй цифры.
        String s5 = s3.toUpperCase(); // все с большой буквы
        String s6 = s3.replace("sonic", "power"); // меняет ненужное слово, на нужное

        int i = s3.length();
        int n = s1.indexOf('u'); // указывает на индекс под которым стоит буква

        char c = s2.charAt(1); // указывает какая буква находится по этому индексу

        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
        System.out.println(i);
        System.out.println(n);
        System.out.println(c);

    }
}
