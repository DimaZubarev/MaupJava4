package lesson2_idea;

public class Zadanie1 {
    public static void main(String[] args) {
//        int i = 2;
//        long d;

//        d = (long) Math.pow(i, 32.0)+1;

//        long c, b;

//        c = d / 641;
//        b = d % 641;

        long i = (long)Math.pow(2,32) + 1;
        int divider = 641;

        int c = (int)(i/divider);
        int b = (int)(i%divider);

        System.out.println(c);
        System.out.println(b);






    }
}
