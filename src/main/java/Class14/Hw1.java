package Class14;

public class Hw1 {
    /*
    Create a method that will take a String
    as a parameter and returns reversed String.
    Method should be available to all classes within
    your project and accessible by class name.
     */
    String reverse(String str){

     for(int i=str.length()-1; i>=0;i--){
         System.out.print(str.charAt(i));
     }
        return str;
    }
}
