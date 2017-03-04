package lesson27_28_multithread.consumer_supplier;

/**
 * Created by Dimon on 18.01.2017.
 */
public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store(10);
        Producer p = new Producer(store);
        Consumer c = new Consumer(store);
        p.start();
        c.start();

    }
}
