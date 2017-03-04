package lesson29_files_in_out;
import java.io.IOException;
import java.io.File;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFile {
    public static void main(String[] args) throws IOException{
        File f1 = new File("My_test.txt");
        System.out.println("Exist = " + f1.exists());
        if (f1.createNewFile())
            System.out.println("Created!");
        System.out.println("Name = " + f1.getName());
        System.out.println("Parent = " + f1.getParent());
        System.out.println(f1.getAbsolutePath());
        System.out.println("List of file current dir: ");

        File dir = new File(".");
        String[]ff = dir.list();
        for (String s : ff) {
            System.out.println(s);
        }

        File newNameFile = new File("My_test2.txt");
        boolean renamed = f1.renameTo(newNameFile);
        System.out.println("Renamed = " + renamed);
        System.out.println(newNameFile.getAbsolutePath());

        Path mf =Paths.get("My_test.txt");
        try {
            Files.move(mf, mf.resolveSibling("My_test5.txt"));
        } catch (FileAlreadyExistsException e) {
            System.out.println("Cannot rename! File alrady exist! (" + e.getMessage());
            System.out.println();
        }
        File newDir = new File("C: " + File.separator + "New_file" + File.separator + "Prosto"); // створення
        // та вказання де буде знаходитись файл.
        boolean dicCreated = newDir.mkdirs();
        System.out.println("dicCreated " + dicCreated);
    }
}
