package lesson11_oop5_polymorhysm.stringBuilder;

public class StringTest {
    public static void main(String[] args) {
        String s ="";
        long before, after;

        before = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
           s = s + "Hello";
        }
        after = System.currentTimeMillis();
        System.out.println(after-before);

        before = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            s = s + "Hello";
        }
        after = System.currentTimeMillis();
        System.out.println(after-before);

        before = System.currentTimeMillis();
        for (int i = 0; i < 30000; i++) {
            s = s + "Hello";
        }
        after = System.currentTimeMillis();
        System.out.println(after-before);

        before = System.currentTimeMillis();
        for (int i = 0; i < 40000; i++) {
            s = s + "Hello";
        }
        after = System.currentTimeMillis();
        System.out.println(after-before);
    }

}
