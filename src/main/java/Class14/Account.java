package Class14;

public class Account {
    String accountNumber="649656";
    double balance=-352;
    String userName="user562";

    private String password="Pass562";
void printInfo(){
    System.out.println(accountNumber);
}

    public static void main(String[] args) {
    Account a=new Account();
        System.out.println(a.password);
        a.printInfo();
    }
}
