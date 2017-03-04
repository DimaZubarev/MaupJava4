package lesson29_files_in_out;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class FileWriteText {
    public static void main(String[] args) {
        try(FileWriter fw = new FileWriter("MyText2.txt", true)){
            fw.write("Time is: " + new Date() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
