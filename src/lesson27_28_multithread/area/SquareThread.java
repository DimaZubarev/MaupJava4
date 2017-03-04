package lesson27_28_multithread.area;

/**
 * Created by Dimon on 17.01.2017.
 */
public class SquareThread extends Thread {
    @Override
    public void run() {
        for (int i = 3; i <= 18; i++) {
            System.out.println("Square area = " + i + " m2");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
