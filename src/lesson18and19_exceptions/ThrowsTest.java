package lesson18and19_exceptions;
public class ThrowsTest {
    public static void main(String[] args) {
        // трай кєч в мейні поганий тон, так не робити
        try {
            m1();
        } catch (InterruptedException e) {
            System.out.println("Нам потрібно виправити помилку");
        }
    }
    static void m1() throws InterruptedException{
        m2();
    }
    static void m2() throws InterruptedException {
        try {
            m3();
        } catch (ArithmeticException e) {
            System.out.println("Catched!");
        }
    }
    static void m3() throws InterruptedException, ArithmeticException {
        Thread.sleep(1000);
    }
}
