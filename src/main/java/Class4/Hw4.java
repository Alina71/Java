package Class4;

import java.util.Scanner;

public class Hw4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you have a credit card?");
        String card = scan.next();
        if (card.equals("no")) {
            System.out.println("Do you want to apply for a new credit card?");
            }else if (card.equals("yes")) {
                System.out.println("What is the balance of the card?");
                int balance = scan.nextInt();
                if (balance > 1000) {
                    System.out.println("Pay the balance off immediately.");
                } else {
                    System.out.println("You can spend more");
                }
            }
        }
    }
