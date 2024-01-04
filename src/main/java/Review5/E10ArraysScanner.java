package Review5;
import java.util.Arrays;
import java.util.Scanner;

public class E10ArraysScanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the size of the Array");
        int size = sc.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter the number" + (i + 1));
            numbers[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
    }
}
