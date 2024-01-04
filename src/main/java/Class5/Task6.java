package Class5;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the country?");
        String country=sc.nextLine();
        switch(country){
    case ("Moldova"):
    System.out.println("Romainian");
    break;
    case ("Russia"):
        System.out.println("Russian");
        break;
    case ("USA"):
        System.out.println("English");
        break;
    case ("Germany"):
        System.out.println("German");
        break;
    case ("UK"):
        System.out.println("English");
        break;
    default:
            System.out.println("Error");

}
    }
}
