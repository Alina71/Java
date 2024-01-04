package Quizz;

public class Q4 {
    public static void main(String[] args) {
        //Create a 2D array of integers. Develop a program which will calculate the
        //sum of even and odd numbers for that array.
        int[][] num = {
                {56, 78, 25, 45, 98, 75, 1},
                {1, 15, 48, 92, 3, 45, 7}
        };
        int sumEven = 0, sumOdd = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if (num[i][j] % 2 == 0) {
                    sumEven = sumEven + num[i][j];
                } else {
                    sumOdd = sumOdd + num[i][j];
                }
            }
        }
        System.out.println("The sum of even numbers is " + sumEven);
        System.out.println("The sum of odd numbers is " + sumOdd);
    }
}
