package lesson27_28_multithread.consumer_supplier;

public class Producer extends Thread{
    private Store store;

    public Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while (true){
            try {
                store.put();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
