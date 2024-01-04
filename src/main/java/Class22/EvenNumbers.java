package Class22;

import java.util.ArrayList;

/*
Create an arrayList of even numbers from 1 to 500 using a loop.
Then write another loop to
Remove any number that is divisible by 5 from that arrayList
 */
public class EvenNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> EvenNumbers = new ArrayList<>();
        for (int i = 2; i <= 500; i ++) {
            EvenNumbers.add(i);

        }
        EvenNumbers.removeIf(i -> (i % 5 == 0));
        for (int i : EvenNumbers) {
            System.out.print(i+" ");
        }

    }
}