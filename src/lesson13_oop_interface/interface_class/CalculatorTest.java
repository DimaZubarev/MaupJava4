package lesson13_oop_interface.interface_class;

import lesson11_oop5_polymorhysm.A;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Arihmetic a;
        Info info;

        System.out.println(calculator.plus(1,2));
        System.out.printf(calculator.getInfo());

        a = calculator;
        a.plus(2,3); // тільки методи інтерфейса Arihmetic
        ((Info)a).getInfo(); // так можливо визивати з Arihmetic та Info

        info = calculator;  // тільки методи інтерфейса Info
        ((Arihmetic)a).plus(2,3); //  так можливо визивати з Info та Arihmetic
    }
}
