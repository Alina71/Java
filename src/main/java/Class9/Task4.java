package Class9;

public class Task4 {
    public static void main(String[] args) {
        //Create a 2D array or integer type
        // and store numbers in 3 rows and 3 columns.
        // Print the sum of all numbers.

        int[][] num={
                {45,23,64},
                {52,13,17},
                {78,11,45}
        };
        int sum=0;
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num.length;j++){
                sum=sum+num[i][j];
            }
        }
        System.out.println("The sum of all numbers is "+sum);
    }
}
