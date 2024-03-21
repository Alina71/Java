package Class24;

import java.util.LinkedHashMap;
import java.util.Map;
/*
Create a map of a building. Store floor number
and its associated company name.
(Example: 1= Google, 2=Syntax etc..).
Insert 7 entries with duplicate keys and values.
Check how many entries you have?
Update company on a 4th floor
Remove company on the 7th floor
Print your map
 */
public class Task1 {
    public static void main(String[] args) {
        Map<Integer,String> floor=new LinkedHashMap<>();
        floor.put(1,"Google");
        floor.put(2,"Amazon");
        floor.put(3,"Syntax");
        floor.put(4,"Apple");
        floor.put(5,"Amazon");
        floor.put(6,"Google");
        floor.put(7,"Apple");
        System.out.println(floor);
        System.out.println(floor.replace(4,"LG"));
        System.out.println(floor.remove(7));
        System.out.println(floor);
        //k-key
        //v-value
        //floor.forEach((k,v));




    }
}
