package lesson2_idea;

public class OverFlowTest {
    public static void main(String[] args) {
        //int i = 2147483647;
        int i = Integer.MAX_VALUE; // максимальное значение инта
        System.out.println("before = " + i);
        i++;
        System.out.println("after = " + i);

        double d = Double.MAX_VALUE;
        System.out.println(d);
        System.out.println(d + d);

        double z = Double.MIN_VALUE;
        System.out.println(z);
        System.out.println(z - z);
    }
}
