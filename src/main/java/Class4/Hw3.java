package Class4;

import java.util.Scanner;

public class Hw3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("What is the city name");
        String city=sc.nextLine();
        System.out.println("What is the temperature in Celsius?");
        double temp=sc.nextDouble();
        double tempInCelsius=(temp-32)*5.0/9.0;
        System.out.println("The temperature in the city "+city+ " is " +tempInCelsius+ " Farenheit");
    }
}
