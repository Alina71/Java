package Class24;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class E6Maps {
    public static void main(String[] args) {

        Map<Integer, String> studentMap = new LinkedHashMap<>();
        studentMap.put(1, "Sino");
        studentMap.put(2, "Nasima");
        studentMap.put(3, "Karimi");
        studentMap.put(4, "Ray");
        studentMap.put(5, "Halil");
        System.out.println(studentMap);
        //Map->Entry->key value
        Set<Map.Entry<Integer, String>> entries = studentMap.entrySet();
        // var StudentEntries=studentMap.entrySet();-the same like above
        for (Map.Entry<Integer, String> e : entries) {
            if (e.getKey() > 2) {
                System.out.println(e.getKey() + " " + e.getValue());
            }
        }
            System.out.println("*******************");

            var entries2 = studentMap.entrySet();
            for (var e : entries2) {
                var key = e.getKey();
                var value = e.getValue();
                System.out.println(key + " " + value);
            }

            System.out.println("********************");
            studentMap.forEach((k,v)->System.out.println(k+" "+v));

        }
    }
