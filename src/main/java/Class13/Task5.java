package Class13;

public class Task5 {
    /*
    Write a method to return whether
    given number is prime or not?
     */
    int primeNum(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("Number is prime.");
        } else {
            System.out.println("Number is not prime.");
        }
        return num;
    }
}

