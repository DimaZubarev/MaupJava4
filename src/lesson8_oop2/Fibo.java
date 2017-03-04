package lesson8_oop2;
// Задача Фібоначі
public class Fibo {
    private int n1;
    private int n2;

    public Fibo() {
        this.n1 = -1;
        this.n2 = 1;
    }
    public int next(){ // метод що генерує числа фібоначі
        int result;
        result = n1 + n2;
        n1 = n2;
        n2 = result;
        return result;
    }
    private void init(){
        this.n1 = -1;
        this.n2 = 1;
    }
    public void reset(){ // метод що онулює метод фібоначі
      init();
    }

    public static void main(String[] args) {
        Fibo fibo = new Fibo();
        System.out.println(fibo.next());
        System.out.println(fibo.next());
        System.out.println(fibo.next());
        System.out.println(fibo.next());
        System.out.println(fibo.next());
        fibo.reset();
        System.out.println(fibo.next());

    }
}
