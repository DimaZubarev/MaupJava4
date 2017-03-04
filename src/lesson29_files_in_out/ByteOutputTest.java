package lesson29_files_in_out;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteOutputTest {
    public static void main(String[] args) {
        byte[]array = {76, 77, 78, 79, 80};
        try(FileOutputStream fos = new FileOutputStream("MyText")){
            for (int i = 65; i < 170; i++) {
                fos.write(i);
            }
            fos.write(array);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
