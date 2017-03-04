package lesson10_oop4_extends;

public class Shape {

    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public void show(){
        System.out.println("I am shape");
    }
}
