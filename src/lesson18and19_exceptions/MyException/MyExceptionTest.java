package lesson18and19_exceptions.MyException;

public class MyExceptionTest {
    public static void main(String[] args) {
           m1();
    }
    static void m1(){
        try {
            m2(0);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
    static void m2(int n) throws MyException{
        if(n==0)throw new MyException("n is zero!");
        else System.out.println("ok!");
    }
}
