package Class9;

public class Task3 {
    public static void main(String[] args) {
        //Create a 2D array or integer type where you will
        // store odd and even numbers in 3 rows and 4 columns.
        // Develop a program which will
        // identify/print the even numbers only.
        int[][] num = {
                {4, 6, 81, 28},
                {5, 7, 92, 64},
                {68, 9, 48, 56}
        };
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if (num[i][j] % 2 == 0) {
                    System.out.print(num[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
