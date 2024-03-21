package Class24;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
Retrieve all keys and values from a Best Buy map using EntrySe
 */
public class Task3 {
    public static void main(String[] args) {
        Map<Integer,String>BBS=new HashMap<>();
        BBS.put(98745,"Apple watch");
        BBS.put(12345,"Laptop");
        BBS.put(65489,"Samsung TV");
        Set<Map.Entry<Integer, String>> entries = BBS.entrySet();
        for (Map.Entry<Integer,String>store:entries){
            System.out.println(store);
        }
        System.out.println("*************************");
        BBS.forEach((k,v)->System.out.println(k+"="+v));
    }

}
