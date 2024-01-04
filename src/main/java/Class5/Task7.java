package Class5;

import java.util.Scanner;

public class Task7 {

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

        System.out.println("Please inter first number.");
        double num1=sc.nextDouble();

        System.out.println("Please enter second number.");
        double num2=sc.nextDouble();

        System.out.println("Please enter operator +,-,*,/");
        String operator=sc.next();
        switch(operator){
            case"-":
                System.out.println(num1-num2);
                break;
            case"+":
                System.out.println(num1+num2);
                break;
            case"*":
                System.out.println(num1*num2);
                break;
            case"/":
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("Error");
        }

    }
}
