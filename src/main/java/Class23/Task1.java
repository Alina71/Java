package Class23;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
How can you remove all duplicates from ArrayList?
 */
public class Task1 {
    public static void main(String[] args) {
        List<String>aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
        Set<String>names=new HashSet<>(aList);
        aList.clear();
        aList.addAll(names);
        System.out.println(aList);
    }
}
