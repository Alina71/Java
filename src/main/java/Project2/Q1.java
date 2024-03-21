package Project2;
/*
Write a program to swap 2 String without a temporary variable.
 */
public class Q1 {
    public static void main(String[] args) {
        String a="Hello";
        String b="World";

        a=a+b;
        System.out.println("Before a= "+a+" b="+b);//HelloWorld
        //10-5=5
        int endIndex=a.length()-b.length();
        b= a.substring(0,endIndex);
        a=a.substring(b.length());
        System.out.println("After a= "+a+" b= "+b);
    }
}
