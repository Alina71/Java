package Class4;

import java.util.Scanner;

public class Hw1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double loan = sc.nextDouble();
        if (loan >= 200000) {
            System.out.println("You would lend the money");
        } else {
            System.out.println("Reject the client");
        }
    }
}
