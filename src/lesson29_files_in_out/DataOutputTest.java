package lesson29_files_in_out;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputTest {
    public static void main(String[] args) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.dat"))) {
            dos.writeDouble(Double.MAX_VALUE);
            dos.writeBoolean(true);
            dos.writeInt(Integer.MIN_VALUE);
            dos.writeUTF("ABCD");
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
