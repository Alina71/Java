package Class23;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class E7Collection {
    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10);
        System.out.println(numbers);
        System.out.println("*******************");

        HashSet<Integer>UniqueNumber=new HashSet<>(numbers);
        System.out.println(UniqueNumber);
        System.out.println("********************");

        LinkedHashSet<Integer>uniqueNumber=new LinkedHashSet<>(numbers);
        System.out.println(uniqueNumber);
        System.out.println("********************");

        TreeSet<Integer>treeSet=new TreeSet<>(uniqueNumber);
        System.out.println(treeSet);
    }
}
