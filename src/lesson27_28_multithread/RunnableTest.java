package lesson27_28_multithread;

/**
 * Created by Dimon on 17.01.2017.
 */
public class RunnableTest {
    public static void main(String[] args) {
        Runnable r1 = new Task1();
        Runnable r2 = new Task2();
        Thread t1 = new MyThread1();
        Thread t2 = new MyThread2();
        t1.run();
        t2.run();
        // start - потоки виконуються одночасно
        // run - потоки виконуються по черзі
    }
}
