package Class9;

public class E6Arrays {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 50},
                {25, 35, 66},
                {80, 90, 78, 45},
                {45, 55, 66}
        };
        //add all of the elements and print it
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int colon = 0; colon < matrix[row].length; colon++) {
                sum = sum + matrix[row][colon];
            }
        }
        System.out.println("The sum is "+sum);
    }
}
