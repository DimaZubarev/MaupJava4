package lesson27_28_multithread.area;

import java.io.FileWriter;
import java.io.IOException;

public class Write {
    static void writeToFile(String fname, String info) {
        try (FileWriter sw = new FileWriter(fname, true)){
            sw.write(info + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
