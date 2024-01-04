package HOMEWORK;

public class Task7 {
    public static void main(String[] args) {
        //Create an array of names and store all names of your group.
        // Then print your name from that array.
        // (use 2 different ways of creating an array).


        String[] name={"Ana","Dan","Bella","Tia","Simon"};
        for (int i = 0; i < name.length; i++)
            System.out.print(name[i] + " ");
        //
        System.out.println();
        int i=0;
        while (i < name.length) {
            System.out.print(name[i] + " ");
            i++;
        }
    }
}
