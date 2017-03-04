package lesson12_oop_abstract_class.variant1;

public class Point3D extends Point2D {
    private double z;

    public Point3D(String color, double x, double y, double z) {
        super(color, x, y);
        this.z = z;
    }

    @Override
    void show() {
        System.out.println("I am point3D");
    }
}
