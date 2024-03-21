package Class23;

import java.util.ArrayList;
import java.util.HashSet;

public class E3Sets {
    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println(numbers);

        HashSet<Integer> nums=new HashSet<>();
        nums.add(10);
        nums.add(20);
        //no get method
        //nums.get(30);
        nums.add(10);
        System.out.println(nums);
    }
}
