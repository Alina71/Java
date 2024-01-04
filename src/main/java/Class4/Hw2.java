package Class4;

import java.util.Scanner;

public class Hw2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your age");
       int age=sc.nextInt();

        if(age>=18){
            System.out.println("I will issue a driver licence");

        }else{
            System.out.println("for now you can only have learnes permit");
        }

    }
}
