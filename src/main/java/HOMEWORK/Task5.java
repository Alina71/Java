package HOMEWORK;

public class Task5 {
    public static void main(String[] args) {
        //Create an array of cars and store 6 elements into it.
        // Using 2 different loops print all values from the array.

        String[] cars = {"BMW", "Audi", "Toyota", "Kia", "Nissan", "RAM"};
        for (int i = 0; i < cars.length; i++)
            System.out.print(cars[i] + " ");
        //2nd
        System.out.println();
        cars[0] = "BMW";
        cars[1] = "Audi";
        cars[2] = "Toyota";
        cars[3] = "Kia";
        cars[4] = "Nissan";
        cars[5] = "RAM";
        int i=0;
        while (i < cars.length) {
            System.out.print(cars[i]+" ");
            i++;
        }

    }
}

