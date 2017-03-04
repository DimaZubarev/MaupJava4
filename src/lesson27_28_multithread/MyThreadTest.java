package lesson27_28_multithread;

public class MyThreadTest {
    public static void main(String[] args) throws InterruptedException{
        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();
        System.out.println("Start");
        myThread1.start();
        myThread2.start();
        //Thread.sleep(10000);
        myThread1.join(); // join - дає команду чекати поки закінчиться робота потока, а потім виконаються інші заплано-
        myThread2.join(); // вані команди.
        System.out.println(Thread.currentThread().getState());
        System.out.println(myThread1.getState());
        System.out.println(myThread2.getState());
        System.out.println("End");

    }
}
