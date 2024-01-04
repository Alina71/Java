package Class9;

public class E4Arrays {
    public static void main(String[] args) {
        int[][] matrix={
                {10,20,50},
                {25,35,66},
                {80,90,78,45},
                {45,55,66}
        };
//entire one D array from the 2D array
        int[] row0=matrix[0];
        System.out.println(row0.length);//3
        for(int i:row0){
            System.out.print(i+" ");
        }
        System.out.println();
        //accesing individual elements from the 2D array
        System.out.println(matrix[2][2]);
    }
}
