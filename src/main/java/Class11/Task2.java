package Class11;

public class Task2 {
    public static void main(String[] args) {

        String str = "Java is Fun";
        //Count how many times letter a has appeared in the String
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a'){
                count++;

            }
        }
        System.out.println(count);
    }
}
