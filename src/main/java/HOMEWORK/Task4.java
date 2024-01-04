package HOMEWORK;

public class Task4 {
    public static void main(String[] args) {
        //Create an array on integers and calculate
        // the sum of all elements in an array
        int[] num = {56, 68, 95, 12, 78, 35};
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
            System.out.print(sum+" ");
        }
    }
}