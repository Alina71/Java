package Quizz;

public class Q9 {
    public static void main(String[] args) {
        //Write a java program to find the
        // second largest number in the array

        int[] num={96,35,25,255,28,987,35,168,45,953,923};
        int largest=0;
        int secondLargest=0;
        for(int i=0;i<num.length;i++){
            if(num[i]>largest){
                secondLargest=largest;
                largest=num[i];
            }
            else if(num[i]>secondLargest){
                secondLargest=num[i];
            }
        }
        System.out.println("Second largest number is "+secondLargest);
        System.out.println("Largest number is "+largest);
    }
}
