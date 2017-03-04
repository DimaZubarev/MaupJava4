package lesson12_oop_abstract_class.var2;

public class PointTest {
    public static void main(String[] args) {
        Point[]points = new Point[3];
        points[0] = new Point1D("Red",1);
        points[1] = new Point2D("Red",1, 2);
        points[2] = new Point3D("Red",1, 2, 3);

        for (int i = 0; i < points.length ; i++) {
            points[i].show();
        }

    }
}
