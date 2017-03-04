package lesson22_Map.invert_map;
import java.util.*;
public class InvertMapMethod {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Fef", 28);
        map.put("Mar", 31);
        map.put("Apr", 30);
        map.put("May", 31);
        map.put("Jun", 30);
        map.put("Jan", 31);
        Map<Integer,String> map2 = new HashMap<>();
        System.out.println(invertMap(map2));
    }
    static <K,V> Map<K,List<V>> invertMap(Map<V,K> map){
    Map<K,List<V>> map2 = new HashMap<>();
        for (Map.Entry<V,K> entry : map.entrySet()) {
            K value = entry.getValue();
            V key = entry.getKey();
            if (!map2.containsKey(value)) map2.put(value, new ArrayList<>());
            map2.get(value).add(key);
        }
        return map2;
    }
}

