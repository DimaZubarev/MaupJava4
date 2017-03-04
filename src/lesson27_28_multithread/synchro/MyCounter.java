package lesson27_28_multithread.synchro;

public class MyCounter {
    private long value = 0L;

    public long getValue() {
        return value;
    }
    public synchronized void incValue(){
        value++;
    }
    public synchronized void decValue(){
        value--;
    }
}
