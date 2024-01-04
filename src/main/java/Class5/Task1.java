package Class5;

import java.util.Scanner;
/*
Prompt the user to enter person heights in inches. Person should be classified as one of the following:
• short (under 60 inch)
• medium(between 60 -72 inch)
• tall (over 72 inch)
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the height");

        double height=sc.nextDouble();
        if(height<60){
            System.out.println("The person is short.");
        }else if(height>=60 && height<72){
            System.out.println("The person is mediu.");
        }else{
            System.out.println("The person is tall.");
        }
    }
}
