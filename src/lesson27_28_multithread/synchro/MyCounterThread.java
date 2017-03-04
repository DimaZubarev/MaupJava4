package lesson27_28_multithread.synchro;

public class MyCounterThread extends Thread{
    private MyCounter counter;

    public MyCounterThread(MyCounter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
         counter.incValue();
        }
    }
}

