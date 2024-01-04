package HOMEWORK;

public class Task1 {
    public static void main(String[] args) {
        //Create an array of chars and store grades into it: A,B,C,D.
        // Then print a grade B (use 2 different ways of creating an array).
        char arr[] = {'A', 'B', 'C', 'D'};
        System.out.println("Please print " + arr[1]);

//2nd loop
        arr[0]='A';
        arr[1]='B';
        arr[2]='C';
        arr[3]='D';
        System.out.println("Please print "+arr[1]);
    }
}
