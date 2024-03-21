package Review10;

import java.util.ArrayList;

public class E1ArrayList {
    public static void main(String[] args) {
        /*
        int=>Integer
        Integer->class
        int->primitive data time
         */
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        System.out.println(numbers);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
        System.out.println("****************");
        for(Integer i:numbers){
            System.out.println(i);
        }
    }
}
