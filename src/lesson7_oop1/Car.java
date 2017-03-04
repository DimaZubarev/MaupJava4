package lesson7_oop1;

public class Car {
    private String color;
    private double weight;
    private int year;
    private double velocity;

    public Car(String color, double weight, int year, double velocity) {
        this.color = color;
        this.weight = weight;
        this.year = year;
        this.velocity = 0;
    }

    public Car() {}

    public String getColor(){return color;}
    public double getWeight(){return weight;}
    public int getYear(){return year;}

    public void setColor(String color){this.color = color;}
    public void setWeight(double weight){this.weight = weight;}
    public void setYear(int year){this.year = year;}

    public void accelerate(double delta){
        velocity += delta;
    }
    public void deaccelerate(double delta){
        velocity -= delta;
    }
    public void printInfo(){
        System.out.println("Car info");
        System.out.println(color);
        System.out.println(weight);
        System.out.println(year);
        System.out.println(velocity);

    }

}
