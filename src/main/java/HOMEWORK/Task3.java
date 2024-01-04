package HOMEWORK;

public class Task3 {
    public static void main(String[] args) {
        //From an array of integer elements find the largest number.
        int [] num={58,68,95,65,123,43,789,568,45,96};
        int largest=num[0];
        for(int i=0;i<num.length;i++){
            if(largest<num[i]) {
                largest = num[i];
            }
        }
            System.out.println("Largest number is "+largest);
        }
    }

