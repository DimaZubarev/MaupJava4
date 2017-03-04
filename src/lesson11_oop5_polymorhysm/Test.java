package lesson11_oop5_polymorhysm;

/**
 * Created by Dimon on 14.12.2016.
 */
public class Test {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        System.out.println(a.getA());
        System.out.println(b.getA());
        System.out.println();
    }
}
