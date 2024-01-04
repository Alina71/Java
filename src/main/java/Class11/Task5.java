package Class11;

public class Task5 {
    public static void main(String[] args) {
        String str="Sunday";
        for(int i=str.length()-1;i>=0;i--){
            String reverse="";
            reverse+=str.charAt(i);
            System.out.print(reverse+" ");
        }
    }
}
