package lesson12_oop_abstract_class.var2;

public class Point3D extends Point2D {
    private double z;

    public Point3D(String color, double x, double y, double z) {
        super(color, x, y);
        this.z = z;
    }

    @Override
    public void show() {
        System.out.println("I am point3D");
    }
}
