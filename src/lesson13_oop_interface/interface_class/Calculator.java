package lesson13_oop_interface.interface_class;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Calculator implements Arihmetic, Info{
    @Override
    public String getInfo() {
        String s = "";
        for (Method m: this.getClass().getDeclaredMethods()) {
            s += m.getName() + " ";
        }
        return "Calculator version 1.0 {" + s + "}";
    }

    @Override
    public double plus(double a, double b) {
        return a+b;
    }

    @Override
    public double minus(double a, double b) {
        return a-b;
    }

    @Override
    public double div(double a, double b) {
        return a/b;
    }

    @Override
    public double mult(double a, double b) {
        return a*b;
    }
}
