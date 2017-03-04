package lesson18and19_exceptions;

public class Test_exceptions2 {
    public static void main(String[] args) {
        int [] a = new int [2];
        try {
           a[(int)System.currentTimeMillis()%3]= 1;
           a[0] = 0/0;
        }
        catch (ArithmeticException e){
            System.out.println("Message "+ e.getMessage());
            e.printStackTrace();
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println("Unknow Exception");
            System.out.println(e.getMessage());
        }
        System.out.println("End of program");
        System.out.println(Double.isInfinite((double)5/1));
    }
}
