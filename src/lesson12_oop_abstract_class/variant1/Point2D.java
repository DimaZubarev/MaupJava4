package lesson12_oop_abstract_class.variant1;

public class Point2D extends Point1D {
    private double y;

    public Point2D(String color, double x, double y) {
        super(color, x);
        this.y = y;
    }

    @Override
    void show() {
        System.out.println("I am point2D");
    }
}
