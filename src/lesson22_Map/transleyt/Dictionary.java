package lesson22_Map.transleyt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dictionary {
    private Map<String, String> engUkr;

    public Dictionary() {
        this.engUkr = new HashMap<>();
    }
    public void loadFroamFile(String filename){
        List<String> lines = null;
        try {
            lines = Files.readAllLines(Paths.get(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String line : lines) {
            String[]words = line.split(";");
            engUkr.put(words[0], words[1]);
        }
    }

    public void addEngUkrWord( String engWord, String ukrWord){
        engUkr.put(engWord, ukrWord);
    }
    public String translateToUkr(String engWord){
        return engUkr.get(engWord);
    }

    @Override
    public String toString() {
        return "Dictionary: " +
                engUkr
                ;
    }
}
