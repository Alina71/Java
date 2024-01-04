package Review7;

public class Task1 {
    /*
    create a method will take an array of ints as input and return sum of
    all numbers from the input array
     */
    public static int arr(int[] number) {
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];

        }
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {

        arr(new int[]{10,20,56});
    }
}