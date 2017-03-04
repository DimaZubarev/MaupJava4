package lesson10_oop4_extends;
public class Triangle extends Shape {

    private double a, b, c;

    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void show() {
        //super.show();
        System.out.println("I am triangle");
    }

    @Override
    public String toString() {
        return "Triangle{" + getColor() +
                " a= " + a +
                ", b= " + b +
                ", c= " + c +
                '}';
    }
}
