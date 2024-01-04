package Class9;

public class Task5 {
    public static void main(String[] args) {
        //Using 2D array create a grocery list.
        //Inside you should have an array of veggies,
        // fruits, dairy and sweets. Retrieve all values
        // from that array using 2 different loops

        String[][] food = {
                {"tomatoes", "beans", "carrots", "onions"},
                {"apples", "bananas", "grapes", "blueberries"},
                {"yogurt", "cheese", "buttermilk", "sour-cream"},
                {"candy", "cupcake", "cake", "ice-cream"}
        };

        for (int i = 0; i < food.length; i++) {
            for (int j = 0; j < food.length; j++) {
                System.out.print(food[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("------------------------");
        for(String[] veggies:food){
            for(String fruits:veggies){
                System.out.print(fruits+" ");

            }
            System.out.println();
        }
    }
}