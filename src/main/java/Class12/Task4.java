package Class12;

public class Task4 {
    public static void main(String[] args) {
        /*Write a program that reads two people's first
names and if they expecting boy or girl?
Based on the input suggests a name for a baby:
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY

Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? girl
Suggested baby name: Maiel
*/
        String fatherName = "Daniel";
        String motherName = "Mary";
        boolean isBoy = false;

        if (isBoy) {
            String fatherFirstPart = fatherName.substring(0, fatherName.length() / 2);
            String motherLastPart=motherName.substring(motherName.length()/2,motherName.length());
            System.out.println(fatherFirstPart.trim()+motherLastPart.trim());
        }else{
            String motherFirstPart=motherName.substring(0,motherName.length()/2);
            String fatherLastPart=fatherName.substring(fatherName.length()/2,fatherName.length());
            System.out.println(motherFirstPart.trim()+fatherLastPart.trim());
        }
    }
    }

