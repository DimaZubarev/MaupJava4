package lesson8_oop2;

import java.util.Comparator;

public class CarShop {
    private Car[] cars;
    private int maxIndex;


    public CarShop(int maxCount) {
        cars = new Car[maxCount];
        maxIndex = -1;
    }

    public void add(Car car) {
        if (maxIndex < cars.length - 1)
            cars[++maxIndex] = car;
        else System.out.println("No place to add car " + car + " !");
    }

    public void delete(int index) {
        if (0 <= index && index < maxIndex) {
            cars[index] = cars[maxIndex];
            cars[maxIndex] = null;
            maxIndex--;
        } else System.out.println("Can not delete!" + "Index " + index + " is not correct");
    }

    public void print() {
        for (int i = 0; i <= maxIndex; i++) {
            System.out.println(cars[i]);
        }
    }

    public void printFilterYear(int year) {
        for (int i = 0; i <= maxIndex; i++) {
            if (cars[i].getYear() >= year)
                System.out.println(cars[i]);
        }
    }

    public void printFiterName(char c) {
        for (int i = 0; i <= maxIndex; i++) {
            if (cars[i].getName().charAt(0) >= c) ;
            System.out.println(cars[i]);
        }
    }


    public double getAverageAge() {
        double sum = 0;
        double aver;
        for (int i = 0; i <= maxIndex; i++) {
            sum += 2016 - cars[i].getYear();
        }
        aver = sum / maxIndex;
        return aver;
    }

    public boolean containsCar(String name) {
        for (int i = 0; i <= maxIndex; i++) {
            if (cars[i].getName().equals(name))return true;
        }
        return false;
    }
}

