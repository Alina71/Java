package Class5;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Please inter first number.");
        double num1=sc.nextDouble();

        System.out.println("Please enter second number.");
        double num2=sc.nextDouble();

        System.out.println("Please enter operator +,-,*,/");
        String operator=sc.next();

        if(operator.equals("+")) {
            System.out.println(num1 + num2);
        }else if(operator.equals("-")){
            System.out.println(num1-num2);
        }else if(operator.equals("*")){
            System.out.println(num1*num2);
        }else if(operator.equals("/")){
            System.out.println(num1/num2);
        }else{
            System.out.println("Error");
        }

    }
}
