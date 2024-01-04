package Quizz;

public class Q10 {
    public static void main(String[] args) {
        //Write a program to print out
        // duplicate elements from an Array of Strings
        String[] names={"Leo","Diana","Maria","Dan","Dorin","Maria","Tom","Leo"};
        for(int i=0;i<names.length;i++){
            for(int j=i+1;j<names.length;j++){
                if(names[i]==names[j]){
                    System.out.println("Print out duplicate element "+names[i]);
                }
            }
        }
        }
    }

