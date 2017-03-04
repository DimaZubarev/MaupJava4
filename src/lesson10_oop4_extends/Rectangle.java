package lesson10_oop4_extends;
public class Rectangle extends Shape{
    private double a, b;
     public Rectangle(String color, double a, double b){
         super(color);
         this.a = a;
         this.b = b;
     }

    @Override
    public void show() {
        System.out.println("I am rectangle");
    }

    @Override
    public String toString() {
        return "Rectangle{" + getColor() +
                " a=" + a +
                ", b=" + b +
                '}';
    }
}

