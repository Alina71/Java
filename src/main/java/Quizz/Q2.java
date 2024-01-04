package Quizz;

public class Q2 {
    public static void main(String[] args) {
        //Create an array of integer values.
        // After the array is created, calculate the
        //sum of all stored elements in that array.

        int [] num={5,8,3,89,12,87,56,1};
        int sum = 0;
        for(int i=0;i<num.length;i++) {
            sum = sum + num[i];
        }
        System.out.print(sum);
    }
}

