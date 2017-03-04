package lesson27_28_multithread.synchro;
public class Main {
    public static void main(String[] args) throws InterruptedException{
        MyCounter counter = new MyCounter();
        for (int i = 0; i < 400; i++) {
            new MyCounterThread(counter).start();
        }

        for (int i = 0; i < 400; i++) {
            new MyCounterThread(counter){
                @Override
                public void run() {
                    for (int j = 0; j < 1000; j++) {
                        counter.decValue();
                    }
                }
            }.start();
        }
        Thread.sleep(3000);
        System.out.println(counter.getValue());
    }
}
