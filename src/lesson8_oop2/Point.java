package lesson8_oop2;

public class Point {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {return x;}

    public double getY() {return y;}

    @Override
    public String toString() {
        return "Point{" +
                "x= " + x +
                ", y= " + y +
                '}';
    }

    static double distance(Point p1, Point p2){ // method style procedur
        double dx = p2.getX() - p1.getX();
        double dy = p2.getY() - p1.getY();
        return Math.sqrt(dx*dx + dy*dy);
    }

    public double distanceTo(Point that){ // method style oop
        double dx = this.x - that.x;
        double dy = this.y - that.y;
        return Math.sqrt(dx*dx + dy*dy);
    }
}
