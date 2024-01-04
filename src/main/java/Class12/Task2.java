package Class12;

public class Task2 {
    public static void main(String[] args) {

        // Create a String that should be
        // combination of letters, numbers and special
        // characters. Find out how many alpha characters
        // are there in the String.

        String str="bkfdSAHBDSH2232398487#Y*&#$%";
        System.out.println(str.replaceAll("[^A-Za-z]","").length());
    }
}
