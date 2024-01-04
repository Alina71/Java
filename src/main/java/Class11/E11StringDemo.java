package Class11;

public class E11StringDemo {
    public static void main(String[] args) {


        String str="hiofhj nroJHJS HAAS5416";
        System.out.println(str.replaceAll("[A-Z]","*"));
        System.out.println("-------------");
        System.out.println(str.replaceAll("[]a-z]","*"));
        System.out.println("-------------");
        System.out.println(str.replaceAll("[0-9]","*"));
        System.out.println("-------------");
        System.out.println(str.replaceAll("[A-D]","*"));
        System.out.println("-------------");
        System.out.println(str.replaceAll("[A-Za-z]","*"));
        System.out.println("-------------");
        System.out.println(str.replaceAll("[A-Z-z0-9]","*"));
        System.out.println("-------------");
        System.out.println(str.replaceAll("[^A-Z]","*"));
        System.out.println("-------------");
        System.out.println(str.replaceAll("[^A-Za-z0-9]",""));
        System.out.println("-------------");
        System.out.println(str.replaceAll("[^A-Za-z0]","*"));
        System.out.println("-------------");
        System.out.println(str.replaceAll("[\\d]",""));
        System.out.println(str.replaceAll("[\\s]",""));
        System.out.println((int)'A');

    }
}
