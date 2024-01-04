package Class12;

public class Task5 {
    public static void main(String[] args) {

        //How would you reverse a String word by word?
        //for exemple input=>This is the sentence I want to reverse.
        //output=> siht si eht ecnetnes i tnaw ot esrever

        String str="This is the sentence I want to reverse .";
        String [] words=str.split(" ");

        for(String w:words){
            for(int i=w.length()-1;i>=0;i--){
                System.out.print(w.charAt(i));
            }
            System.out.print(" ");
        }
    }
}
