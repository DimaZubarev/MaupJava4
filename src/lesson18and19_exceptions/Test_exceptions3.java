package lesson18and19_exceptions;

public class Test_exceptions3 {
    public static void main(String[] args) {
        String a = "5";
        String b = "50";
        int i1 = 6;
        int i2 = 0;
        try {
            double d1 = Double.parseDouble(a);
            double d2 = Double.parseDouble(b);
            int i3 = i1/i2;
        }
        catch (NumberFormatException e){
            System.out.println("Помилка! Ви вели не вірний формат запису " + a);
        }
        catch (ArithmeticException e){
            System.out.println("Ви ділите на ноль");
        }


    }

}
