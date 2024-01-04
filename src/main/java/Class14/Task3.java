package Class14;
/*
Create a method that will accept an array as
parameters and will return a sum of all elements
 from that array. Method should be visibly only
  within same package and accessible by
the creating an instance/object of the class.
 */

public class Task3 {
    int sumArray(int[]arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }


    public static void main(String[] args) {
        Task3  t=new Task3();
        int[]numbers={23,45,68};
        int sum=t.sumArray(numbers);
        System.out.println(sum);
    }
  }
