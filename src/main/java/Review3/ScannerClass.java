package Review3;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        //dataType variable = value
        int num=12;
        System.out.println(num);
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter today's month");
        String month=input.next(); // next() = captures 1 word
        System.out.println("Please enter today's date");
        int day= input.nextInt();
        System.out.println("Please enter today's year");
        int year= input.nextInt();
        System.out.println("Today is "+month+" "+day+", "+year);
        System.out.println("Are you tired");
        boolean isTired=input.nextBoolean();
        System.out.println("Are you F or M");
        char gender=input.next().charAt(0);
        System.out.println(gender);
    }
}
