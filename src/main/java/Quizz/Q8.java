package Quizz;

public class Q8 {
    public static void main(String[] args) {
        //Maximum and minimum number in the array
        int[] num={12,68,13,103,1,93,48,56,73,99};
        int max=num[0];
        int min=num[0];
        for(int i=0;i<num.length;i++){
            if(num[i]>max){
                max=num[i];
            }else if(num[i]<min){
                min=num[i];
            }
        }
        System.out.println("maximum number is "+max);
        System.out.println("Minimum number is "+min);
    }
}
