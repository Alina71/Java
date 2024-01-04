package Review3;

public class LogicalAnd {
    //for logical AND(&&) all conditions needs to be TRUE to get a TRUE
    public static void main(String[] args) {
        boolean rain = true;
        boolean cold = false;

        if (cold && rain) {
            System.out.println("I am staying home.");
        }

        boolean messageDisplayed=true;
        String errorMessage="Invalid credentials";

        if(messageDisplayed && errorMessage.equals("Invalid Credentials")) {
            System.out.println("Test case passed");
        }else{
            System.out.println("Test case failed");
        }
    }

}