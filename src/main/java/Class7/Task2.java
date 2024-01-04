package Class7;

import java.util.Scanner;
 class Main {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Please enter day 1 of the week");
            String day1=scan.nextLine();

            System.out.println("Please enter day 2 of the week");
            String day2=scan.nextLine();

            System.out.println("Please enter day 3 of the week");
            String day3=scan.nextLine();

            System.out.println("Please enter day 4 of the week");
            String day4=scan.nextLine();

            System.out.println("Please enter day 5 of the week");
            String day5=scan.nextLine();

            System.out.println("Please enter day 6 of the week");
            String day6=scan.nextLine();

            System.out.println("Please enter  day 7 of the week");
            String day7=scan.nextLine();

//Sy
            String[] days={day1,day2,day3,day4,day5,day6,day7};

            for(int i=1;i<days.length;i++){


                System.out.println(days);
            }
        }
    }