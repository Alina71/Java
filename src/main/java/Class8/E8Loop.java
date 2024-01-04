package Class8;

public class E8Loop {
    public static void main(String[] args) {

        char[] word={'s','u','n','d','a','y'};
        //write a loop to print these letters in reverse order
         for(int i=word.length-1; i>=0; i--){
             System.out.print(word[i]+" ");
         }
    }
}
