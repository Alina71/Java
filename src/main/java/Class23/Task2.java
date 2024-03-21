package Class23;

import java.util.TreeSet;

public class Task2 {
    public static void main(String[] args) {
        TreeSet<String> country = new TreeSet<>();
        country.add("USA");
        country.add("Italy");
        country.add("France");
        country.add("Moldova");
        country.add("Mexico");
        System.out.println(country);
        System.out.println("*********");
        for (String c : country) {
            System.out.println(c);
        }
    }
}
