package lesson27_28_multithread.consumer_supplier;

public class Consumer extends Thread {
    private Store store;

    public Consumer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while (true){
            try {
                store.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

