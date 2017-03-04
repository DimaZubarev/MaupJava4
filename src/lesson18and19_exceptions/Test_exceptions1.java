package lesson18and19_exceptions;

public class Test_exceptions1 {
    public static void main(String[] args) {
        int a = 3;
        int b = 0;
        try {
            System.out.println(a);
            System.out.println(a/b);  // Помилка ArithmeticException
            System.out.println(b);  // Ніколи не виповниться, так як вже була виявлена помилка
        }
        catch (ArithmeticException e){ // Перехоплення виключення
            System.out.println("Ділення на нуль");
        }
        finally { // Частина коду, який виконається в любому випадку
            System.out.println("Але программа все одно працює");
        }
        System.out.println("Кінец программи");

    }
}
