package Class8;

import java.util.Scanner;

public class E6ScannerAndArray {
    public static void main(String[] args) {

        int[] numbers=new int[5];
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<numbers.length;i++){
            System.out.println("Please enter a number");
            numbers[i]=scanner.nextInt();
        }
        System.out.println("Here are all the numbers that you entered");
        for(int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]+" ");
        }
    }
}
