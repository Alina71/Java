package Class11;

public class E2StringDemo {
    public static void main(String[] args) {
        //Creating an object of the String class
        String str="Batch 18";//this is recommended
        String str2=new String("Batch 18");
        System.out.println(str.length());
        System.out.println(str2.length());

        boolean isEmpty=str.isEmpty();
        System.out.println(isEmpty);
    }
}
