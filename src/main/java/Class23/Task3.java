package Class23;

import java.util.LinkedHashSet;
import java.util.Set;

/*
Create a Set of cities in which you want to
make sure that insertion order is maintained.
Then remove any city that starts with “A”;
 */
public class Task3 {
    public static void main(String[] args) {
        Set<String> city = new LinkedHashSet<>();
        city.add("Chisinau");
        city.add("Bucuresti");
        city.add("Millano");
        city.add("Antalia");
        city.add("Alabama");
        city.removeIf(x -> x.startsWith("A"));
        System.out.println(city);
    }
}