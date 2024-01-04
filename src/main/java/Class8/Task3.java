package Class8;

public class Task3 {
    public static void main(String[] args) {

        int[] numbers={10,15,20,18,9,60,22,30};
        //show the sum of even numbers and odd numbers
        //separately
           int sumOdd=0,sumEven=0;
           for(int num:numbers){

               if(num%2==0){
                   sumEven=sumEven+num;
               }else{
                   sumOdd=sumOdd+num;
               }

           }
        System.out.println("Sum of the even number is "+sumEven);
        System.out.println("Sum of  the odd number is "+sumOdd);
    }
}
