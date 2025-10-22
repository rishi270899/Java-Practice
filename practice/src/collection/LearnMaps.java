package collection;
import java.util.*;

public class LearnMaps {
    static void main(String[] args) {
        // Map practice

        Map<String, String> map = new HashMap<>();
        map.put("us", "united state");
        map.put("uk", "united kingdom");
        map.put("in", "india");
        map.put("In", "india");


        Set<String> keys = map.keySet();
        System.out.println(keys);

//        Set<String> val = (Set<String>) map.values();
//        System.out.println(val);


        ArrayList<String> key = new ArrayList<>(map.keySet());
        System.out.println(key);



//        System.out.println(map);
//        System.out.println(map);
    }
}


