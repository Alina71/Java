package Class13;
/*
Create a method that will print whether
given String is palindrome or not.
 */
public class Task3 {
    void isPalidrome(String word){
        String reverseWord="";
        for(int i=word.length()-1;i>=0;i--) {
            reverseWord = reverseWord + word.charAt(i);
        }
            if (word.equalsIgnoreCase(reverseWord)) {
                System.out.println("it's Palindrome");

            } else {
                System.out.println("It's not Palindrome");
            }
        }

    }

