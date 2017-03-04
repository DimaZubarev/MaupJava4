package lesson10_oop4_extends;

public class Circle extends Shape{
     private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void show() {
        System.out.println("I am circle");
    }

    @Override
    public String toString() {
        return "Circle{" + getColor() +
                " radius=" + radius +
                '}';
    }
}
