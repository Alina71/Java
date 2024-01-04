package Class22;

import java.util.ArrayList;

/*
Create an arraylist of cars and retrieve all
 the values using 2 different ways.
 */
public class ArrayListCars {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Toyota");
        cars.add("BMW");
        cars.add("Tesla");
        cars.add("Nissan");
        cars.add("Mercedes");
        cars.add("Kia");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i) + " ");
        }

        System.out.println(cars);
    }
}
