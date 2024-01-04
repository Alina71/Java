package Review3;

public class LogicalOr {
    public static void main(String[] args) {
        boolean rain = true;
        boolean cold = false;

        if (cold || rain) {
            System.out.println("I am staying home.");
        }
        String welcomeMassage="Welcome Admin";
        boolean dashboardFormDisplayed=true;
        if(welcomeMassage.equals("Welcome Admin")||dashboardFormDisplayed){
            System.out.println("Admin user is successful logged in");
        }else{
            System.out.println("Cannot login using admin credentials ");
        }
    }
}
