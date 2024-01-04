package Quizz;

public class Q3 {
    public static void main(String[] args) {
        //Create a 2D array or integer type
        // where you will store odd and even
        //numbers. Develop a program which
        // will identify/print the even numbers only

        int[][] num={
                {56,23,45,7,18,96},
                {29,64,12,17,91,2},
                {12,56,13,9,8,45,}
        };
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[i].length;j++){
                if (num[i][j] % 2 == 0){
                    System.out.print(num[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
