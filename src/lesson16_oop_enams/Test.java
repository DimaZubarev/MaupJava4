package lesson16_oop_enams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        //File file = new File ("test.txt.txt");
        // Вивод тексту з файла
        List <String> list = Files.readAllLines(Paths.get("test.txt"));
        List<String> words = new ArrayList<String>();

        for (int i = 0; i < list.size(); i++) {
            String [] tmp = list.get(i).split(" ");
            for (String word : tmp) {
               words.add(word);
            }
        }
        System.out.println(words);
        System.out.println();

        for (String s : list) {
            System.out.println(s);
        }
        list.forEach(s -> System.out.println(s));
       /* for (String s : list) {
            System.out.println(s);
        }
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        Comparator <String> c1 = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        };*/
    }
}
