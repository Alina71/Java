package Homework2;

public class H2 {
    public static void main(String[] args) {
        double mortgageprice = 4.1;
        int houseprice =500000;

        if (mortgageprice > 4.5) {
            System.out.println("User will not buy a house.");
        } else {
            System.out.println("User will consider buying.");
        }
        if (houseprice > 100000) {
            System.out.println(" User will take a loan.");
        } else {
            System.out.println("User will pay cash.");
        }
    }
}
