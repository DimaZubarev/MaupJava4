package lesson22_Map.invert_map;

import java.util.*;

public class InvertTask {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Fef", 28);
        map.put("Mar", 31);
        map.put("Apr", 30);
        map.put("May", 31);
        map.put("Jun", 30);
        map.put("Jan", 31);
        System.out.println(map);

        Map<Integer,ArrayList<String>> map2 = new HashMap<>();
        Set<Integer> values = new HashSet<>(map.values());
        /*for (Integer value : values){
            map2.put(value, new ArrayList<>());
        }*/
        // Якщо використовуємо фор тоді коментуємо іф та навпаки
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            Integer days = entry.getValue();
            String month = entry.getKey();
            if(!map2.containsKey(days)) map2.put(days, new ArrayList<>());
            map2.get(days).add(month);
            }
        System.out.println(map2);
        }

    }


