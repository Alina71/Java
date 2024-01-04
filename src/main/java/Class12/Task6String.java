package Class12;

public class Task6String {
    public static void main(String[] args) {

        //How wolud  you check if String is Palindrome or not?
        //ex mom=>true
        //   car=>false
        String str = "mom";
      String reversedWord="";
      for (int i = str.length() - 1; i >= 0; i--) {
          reversedWord=reversedWord+str.charAt(i);
            }
      if(str.equalsIgnoreCase(reversedWord)){
          System.out.println("It's a Palindrome");
        }else{
          System.out.println("It's not a Palindrome");
      }
    }
}
