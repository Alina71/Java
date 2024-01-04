package Class12;

public class HW {
    public static void main(String[] args) {
       /*
       swap  2 strings without a temporary variable?
        */

        String word1="eu";
        String word2="tu";
        System.out.println("Before was "+word1+" and "+word2+".");

        word1=word1+word2;
        word2=word1.substring(0,word1.length()-word2.length());
        word1=word1.substring(word2.length());
        System.out.println("After is "+word1+" and "+word2+".");
    }
}
