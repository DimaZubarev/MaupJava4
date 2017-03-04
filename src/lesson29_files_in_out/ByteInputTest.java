package lesson29_files_in_out;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteInputTest {
    public static void main(String[] args) {
        byte[]array = new byte[5];
        try(FileInputStream fis = new FileInputStream("MyText")){
            for (int i = 65; i < 170; i++) {
                int b = fis.read();
                System.out.print(fis.read() + " ");
            }
            fis.read(array);
            System.out.println(Arrays.toString(array));
        } catch (IOException e) {
            e.printStackTrace();
        }

        int b = 0;
        try(FileInputStream fis = new FileInputStream("MyText")){
            while ((b = fis.read()) != -1);
            System.out.print(b + " ");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
