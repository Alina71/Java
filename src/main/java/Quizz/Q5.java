package Quizz;

public class Q5 {
    public static void main(String[] args) {
        //Write a program to swap 2 numbers
        // without a temporary variable


        int i=12;
        int j=21;
        System.out.println("Before swapping the numbers:");
        System.out.println("i value is: "+i);
        System.out.println("j value is: "+j);


        i=i+j;
        j=i-j;
        i=i-j;
        System.out.println();
        System.out.println("After swapping the numbers:");
        System.out.println("i value is: "+i);
        System.out.println("j value is: "+j);
    }
}
