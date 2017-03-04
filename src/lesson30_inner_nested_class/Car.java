package lesson30_inner_nested_class;

import java.util.Arrays;

public class Car {
    private String name;
    private Engine engine;

    public Car(String name, String engName, int engPower) {
        this.name = name;
        this.engine = new Engine(engName, engPower);
    }

    class Engine{ // inner class - внутрішній клас
       private String name;
       private int power;

       public Engine(String name, int power) {
           this.name = name;
           this.power = power;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "name='" + name + '\'' +
                    ", power=" + power +
                    " of car " + Car.this.name +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Car{"
                + engine +
                '}';
    }
    static class Info{
       void printInfo(){
           System.out.println("Car info = " + Arrays.toString(Car.class.getDeclaredFields()));
           System.out.println("Engine info = " + Arrays.toString(Engine.class.getDeclaredFields()));
       }
    }
}


