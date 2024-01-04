package HW;

public class PrivateClass {
    /*
    Create 1 class with a private method that has 3
     overloaded forms. Then call each overloaded
     method with specific arguments and observe result.
     */
    private static void add(int a,double b, int c){
        System.out.println(a+b+c);
    }
    private static void add(double a,double b,int c){

        System.out.println(a+b+c);
    }
    private static void add(int a,int b,int c){
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
        PrivateClass.add(2,5.9,9);
        PrivateClass.add(2.3,9.2,6);
        PrivateClass.add(98,2,5);
    }
}
