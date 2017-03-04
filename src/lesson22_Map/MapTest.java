package lesson22_Map;

import javafx.print.Collation;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Feb", 28);
        map.put("Jan", 31);
        map.put("Mar", 31);
        map.put("Apr", 30);

        System.out.println(map.get("Feb"));
        map.remove("Apr");
        System.out.println(map);

        // 1.множество (set) ключей
        Set<String> keySet = map.keySet();
        System.out.println("keySet = " + keySet);

        // 2.колекція значень
        Collection values = map.values();
        System.out.println("values = " + values);

        //3.множество ключ-значень
        Set<Map.Entry<String, Integer>> keyValues = map.entrySet();
        //System.out.println("kyValues = "+ keyValues);
        for (Map.Entry<String, Integer> kV : keyValues) {
            System.out.println(kV.getKey() + " = " + kV.getValue());
        }

        System.out.println("has key = Jan? " + map.containsKey("jan"));
        System.out.println("has vale = 28? " + map.containsValue(28));
        System.out.println("First entry = " + keyValues.iterator().next());
    }
}
