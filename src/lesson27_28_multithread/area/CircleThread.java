package lesson27_28_multithread.area;

import java.io.FileWriter;
import java.io.IOException;

public class CircleThread extends Thread {
    @Override
    public void run() {
        for (int i = 3; i <= 18; i++) {
            System.out.println("Circle area = " + i + " m2");
            Write.writeToFile("Area.txt", "Square area = " + i + " m2");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
