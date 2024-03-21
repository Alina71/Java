package Class24;

import java.util.ArrayList;
import java.util.HashMap;

public class E4Maps {
    public static void main(String[] args) {
        var fruit = new HashMap<>(); //this one is better to use
        fruit.put("Apple", 20);
        fruit.put("Banana", 15);
        fruit.put("Kiwi", 5);
        fruit.put("Orange", 20);
        System.out.println(fruit);
        System.out.println(fruit.keySet());
        System.out.println(fruit.values());
        //returns the keys in the form of a set to use loop
        var keys = fruit.keySet();
        var arrayList=new ArrayList<>();
        for (var k : keys) {
            System.out.println(k);
        }
    }
}