package lesson14_oop_generic;

/**
 * Created by Dimon on 22.12.2016.
 */
public class ComplexTest {
    public static void main(String[] args) {
        Complex c1 = new Complex(5,7);
        Complex c2 = new Complex(5,3);
        Complex c3 = new Complex(1,1);

        System.out.println(c1.plus(c2).minus(c3));
    }
}
