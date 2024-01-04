package Quizz;

public class Q1 {
    public static void main(String[] args) {
//Create a program that uses an array to
// store a list of temperatures for a week,
//and then uses a loop to find the highest
// and lowest temperature for the week

        int[] temp={76,83,92,82,69,85,88};
        int max=temp[0];
        int min=temp[0];
        for(int i=0;i<temp.length;i++){
            if(temp[i]>max){
                max=temp[i];
            }else if(temp[i]<min){
                min=temp[i];
            }
        }
        System.out.println("The highest temperature  of the week is " +max);
        System.out.println("The lowest temperature of the week is "+min);
    }

}
