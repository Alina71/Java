package Class5;
/*
V=Write a program that will read three inputs of scores (quiz, mid term, and final scores) and determine the grade based on the following rules:
if the average score >=90 → grade=A
if the average score >= 70 and <90 → grade=B
if the average score>=50 and <70 → grade=C
if the average score<50 → grade=F
 */

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("What is the quiz score?");
        double quiz=sc.nextDouble();

        System.out.println("Mid score?");
        double mid=sc.nextDouble();

        System.out.println("Your finals?");
        double finals=sc.nextDouble();

        double as=(quiz+mid+finals)/3;
        if(as>=90){
            System.out.println("Grade A");
        }else if(as>=70 && as<90){
            System.out.println("Grade B");
        }else if(as>=50 && as<70){
            System.out.println("Grade C");
        }else if(as<50){
            System.out.println("Grade F");
        }else{
            System.out.println("Error");
        }
    }
}
