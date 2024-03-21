package Class24;

import java.util.HashMap;
import java.util.Map;

public class E7Maps {
    public static void main(String[] args) {
        Map<String, Integer> fruit = new HashMap<>(); //this one is better to use
        fruit.put("Apple", 20);
        fruit.put("Banana", 15);
        fruit.put("Kiwi", 5);
        fruit.put("Orange", 20);
        fruit.forEach((k,v)->System.out.println(k+" "+v));
        System.out.println("******************");
        fruit.forEach((k,v)->{

            if(k.contains("A")||v>10){
                System.out.println(k+" "+v);
            }
        });
    }
}
