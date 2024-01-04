package Class4;

import java.util.Scanner;

public class Hw5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many year you have been working?");
        Double work = scan.nextDouble();
        if (work >=5) {
            System.out.println("You are eligible for bonus.");
        } else {
            System.out.println("You are not eligible for bonus");
        }
        System.out.println("Please enter your salary.");
            int salary = scan.nextInt();
            if (salary >= 500000) {
                System.out.println("you are eligible for 5000 bonus");
            } else {
                System.out.println("You are not eligible for bonus");
            }
        }
    }


