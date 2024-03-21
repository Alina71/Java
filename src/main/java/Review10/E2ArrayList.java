package Review10;

import java.util.ArrayList;

public class E2ArrayList {
    public static void main(String[] args) {

        ArrayList<Double>numbers=new ArrayList<>();
        numbers.add(15.0);
        numbers.add(25.0);
        numbers.add(35.0);
        numbers.add(45.0);
        numbers.add(55.0);
        numbers.add(65.0);
        System.out.println(numbers);
       //numbers.remove(5);
        numbers.remove(25.0);
        System.out.println(numbers);
    }
}
