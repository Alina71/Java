package Class5;

import java.util.Scanner;
/*
Write a program that will prompt the user for
Day number and print whether it is a weekend or weekday.
If any day from 1-5 → output “It is a weekday”, anyday
from 6-7 → output “It is a weekend”, any other day → output
“Invalid day”
Test your task for -1 3 6 and 8
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 7.");

        int day=sc.nextInt();
        if(day>=1 && day<=5) {
            System.out.println("It is a week day.");
        } else if(day==6 && day==7){
                System.out.println("It is a weekend.");

            }else{
                System.out.println("Invalid day");
            }
        }

    }

