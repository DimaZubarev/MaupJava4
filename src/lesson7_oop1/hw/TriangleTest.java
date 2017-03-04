package lesson7_oop1.hw;
public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(7, 12, 5);
        System.out.println(triangle);
        System.out.println(triangle.area(6, 12));
        System.out.println(triangle.perimeter(6, 12, 5));
    }
}
