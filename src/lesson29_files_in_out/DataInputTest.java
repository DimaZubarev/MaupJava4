package lesson29_files_in_out;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputTest {
    public static void main(String[] args) {
        double a = 0;
        boolean b = false;
        int c = 0;
        StringBuffer s = new StringBuffer("");
            try (DataInputStream dis = new DataInputStream(new FileInputStream("data.dat"))) {
                a = dis.readDouble();
                b = dis.readBoolean();
                c = dis.readInt();

                while (dis.available()>0){
                    s.append(dis.readUTF());
                }
            } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(s);
    }
}
