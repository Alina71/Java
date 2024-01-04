package Review4;

public class NestedLoop {
    public static void main(String[] args) {


        for(int i=1; i<=3;i++){ //outer loop controls the number of the

            System.out.println("Hello");

            for (int j=1;j<3;j++){//inner loop always depends on the outer loop
                System.out.println("Bye");
            }
        }
    }
}
