package lesson7_oop1.hw;

public class Triangle {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {return a;}

    public double getB() {return b;}

    public double getC() {return c;}

    @Override
    public String toString() {
        return "Triangle{" +
                "a = " + a +
                ", b = " + b +
                ", c = " + c +
                '}';
    }

    public double area(double a, double b){
        return (getA() * getB()) / 2;
    }

    public double perimeter(double a, double b, double c){
        return getA() + getB() + getC();
    }
}
