package lesson29_files_in_out;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) {
        String tmp = "";
        try(BufferedReader br = new BufferedReader(new FileReader("MyText2.txt"))){
            while ((tmp = br.readLine()) != null){
                System.out.println(tmp);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
