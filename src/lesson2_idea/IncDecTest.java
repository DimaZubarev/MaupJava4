package lesson2_idea;

public class IncDecTest {
    public static void main(String[] args) {
        int a1 = 4;
        int a2 = 4;
        int b, c;
        b = a1++;
        // b = a1;
        // a1 = a1 + 1;
        System.out.println(b);

        c = ++a2;
        // a2 = a2 + 1;
        // c = a2;
        System.out.println(c);

        System.out.println("a1 = " + a1);
        System.out.println("a2 = " + a2);


    }
}
