package Class24;

import java.util.Map;
import java.util.TreeMap;
/*
Create a map of countries(5) with its capital that will store countries in alphabetical order. Country names will be keys and capitals will be values
Print all keys and values from a country map using for each loop or Lambda.
Print all values from a country map using for each loop or Lambda.
 */

public class Task2 {
    public static void main(String[] args) {
        Map<String,String> countries=new TreeMap<>();
        countries.put("USA","Washington");
        countries.put("Moldova","Chisinau");
        countries.put("Rominia","Bucuresti");
        countries.put("Mexico","Mexico City");
        countries.put("Canada","Ottawa");
        countries.forEach((k,v)->System.out.println(k+" "+v));
    }
}
