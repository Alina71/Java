package Review3;

import java.util.Scanner;

public class SwitchAndScanner {
    public static void main(String[] args) {
        /*
        Ask user where he is from and based on
        the country specify favorite food
         */
        Scanner capture=new Scanner(System.in);
        System.out.println("Please enter where are you from");
        String country=capture.nextLine();
        switch (country.toUpperCase()){

            case"India":
                System.out.println("You love biriyani");
                break;
            case "Egypt":
                System.out.println("You love Koshary");
                break;
            case"Georgia":
                System.out.println("You love Hachapuri");
                break;
            case"Moldova":
                System.out.println("You love Mamaliga");
                break;
            case"Kazakhstan":
                System.out.println("You love beshparmark");
                break;
            case"USA":
                System.out.println("You love burger and french fries");
                break;
            case"Great Britain":
                System.out.println("You love fish and chips");
                break;
            default:
                System.out.println("I don't know your favorite food");

        }
    }
}
