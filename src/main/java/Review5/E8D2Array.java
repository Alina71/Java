package Review5;

public class E8D2Array {
    public static void main(String[] args) {

        int[][] numbers = {
                {10, 20, 30, 40},
                {20, 40, 60, 80},
                {30, 60, 90, 120}
        };

        //getting back complete 1d array from 2d
        int[] row = numbers[0];

        //getting back individual number from 2 d array
        int num = numbers[2][2];

        System.out.println(num);
    }
}