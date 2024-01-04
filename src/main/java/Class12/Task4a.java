package Class12;

import java.util.Scanner;

public class Task4a {
    /*Write a program that reads two people's first
names and if they expecting boy or girl?
Based on the input suggests a name for a baby:
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY

Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? girl
Suggested baby name: MAIEL*/
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Mom's first name");
        String momName = sc.nextLine();
        System.out.println("Dad's first name");
        String dadName = sc.nextLine();
        System.out.println("Boy or Girl?");
        String gender = sc.nextLine();
        if (gender.equalsIgnoreCase("boy")) {
            String fatherFirstPart = dadName.substring(0, dadName.length() / 2);
            String motherLastPart = momName.substring(momName.length() / 2, momName.length());
            System.out.println(fatherFirstPart.trim() + motherLastPart.trim());
        } else {
            String motherFirstPart = momName.substring(0, momName.length() / 2);
            String fatherLastPart = dadName.substring(dadName.length() / 2, dadName.length());
            System.out.println(motherFirstPart.trim() + fatherLastPart.trim());
        }

    }
}
