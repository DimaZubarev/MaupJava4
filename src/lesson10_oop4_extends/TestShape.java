package lesson10_oop4_extends;

public class TestShape {
    public static void main(String[] args) {
        Triangle triangle = new Triangle("Gold", 1, 2, 3);
        Circle circle = new Circle("Red", 15);
        Rectangle rectangle = new Rectangle("Orange", 10, 50);
        System.out.println(triangle);
        System.out.println(circle);
        System.out.println(rectangle);
        triangle.show();
        circle.show();
        rectangle.show();
        System.out.println("Polymorhysm:");
        Shape shape1;
        Shape shape2;
        shape1 = new Circle("Blue", 4);
        shape2 = new Rectangle("white",10, 15);
        shape1.show();
        shape2.show();



    }

}
