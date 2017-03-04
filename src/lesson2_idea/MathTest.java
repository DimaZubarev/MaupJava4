package lesson2_idea;
import java.lang.Math;
public class MathTest {
    public static void main(String[] args) {

        int x = 2;
        int y = 3;
        int z = (int)(Math.pow(x,y));

        System.out.println(z);
        System.out.println(Math.PI/2);
        System.out.println(Math.sin(Math.PI/2));

        int a = 5;
        System.out.println("a / 2 = " + a/2);
        System.out.println("a / 2.0 = " + a/2.0);
        System.out.println("(double) a/2 = " + (double)a/2);

    }
}
