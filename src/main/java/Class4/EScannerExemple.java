package Class4;

import java.util.Scanner;

public class EScannerExemple {
    public static void main(String[] args) {
        System.out.println("Please enter your age");
        /*
         Scanner is datatype
         scan is variable
         new is a keyword that we use to create objects
         (System.in) means we want to read from keyboard
         */
        Scanner scan=new Scanner(System.in);
        //scan.nextInt() take the int number from the
        //keyboard and store it inside age variable
        int age=scan.nextInt();
        System.out.println("You are "+age+" years old");
    }
}
