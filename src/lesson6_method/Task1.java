package lesson6_method;

public class Task1 {
    public static void main(String[] args) {
        double h = 1;
        double d = 1.5;
        double g = 0.4;
        double v  = volume(h, d, g);
        System.out.println(v);
    }
    static double volume(double h, double d, double g){
        return h*d*g;
    }
}
