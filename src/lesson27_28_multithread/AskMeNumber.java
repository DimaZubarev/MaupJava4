package lesson27_28_multithread;

public class AskMeNumber extends Thread{
    private int count = 0;
    private boolean stop = false;

    public int getCount() {
        return count;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    @Override
    public void run() {
        while (!stop);
        count++;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
           //stop =true;
            return;
        }
    }
}
