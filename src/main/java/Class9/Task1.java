package Class9;

public class Task1 {
    public static void main(String[] args) {
        //Create a 2D array or integer type and
        // store numbers in 3 rows and 3 columns.
        // Print the sum of all numbers.
        String[][] students={
                {"Alex","Amy","Diana","Riggo"},
                {"A","B","C","D"}
                };

for(int i=0; i<students.length;i++){
    if (students[1][i].equals("A") || students[1][i].equals("B")); {
        System.out.println(students[0][i]+" "+students[1][i]);
    }
    }
}

}

