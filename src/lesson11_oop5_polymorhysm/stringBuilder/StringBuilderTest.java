package lesson11_oop5_polymorhysm.stringBuilder;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        long before, after;

        before = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            sb.append("Hello");
        }
        after = System.currentTimeMillis();
        System.out.println(after-before);

        sb = new StringBuilder("");
        before = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            sb.append("Hello");
        }
        after = System.currentTimeMillis();
        System.out.println(after-before);

        sb = new StringBuilder("");
        before = System.currentTimeMillis();
        for (int i = 0; i < 30000; i++) {
            sb.append("Hello");
        }
        after = System.currentTimeMillis();
        System.out.println(after-before);

        sb = new StringBuilder("");
        before = System.currentTimeMillis();
        for (int i = 0; i < 40000; i++) {
            sb.append("Hello");
        }
        after = System.currentTimeMillis();
        System.out.println(after-before);
    }

}
