package lesson27_28_multithread.consumer_supplier;

public class Store {
    private int count;

    public Store(int count) {
        this.count = count;
    }
    public synchronized void put() throws InterruptedException{
        count++;
        System.out.println("Put! " + count + " items");
        Thread.sleep(500);
        notify();
    }
    public synchronized void get() throws InterruptedException{
        while (true){
            if (count > 0) {
                count--;
                System.out.println("Got one! Left: " + count + " items");
                System.out.println(Thread.currentThread().getStackTrace()[2].getClassName()); // це строка яка показує хто визвав темод
                Thread.sleep(500);
                return;
            } else
                wait();
        }
    }
}
