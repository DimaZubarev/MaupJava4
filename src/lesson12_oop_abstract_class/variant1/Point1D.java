package lesson12_oop_abstract_class.variant1;

public class Point1D extends Point {
    private double x;

    public Point1D(String color, double x) {
        super(color);
        this.x = x;
    }

    public double getX() {
        return x;
    }

   @Override
    void show(){
        System.out.println("I am point1D");
    }
}
