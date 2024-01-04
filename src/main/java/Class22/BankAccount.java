package Class22;

public class BankAccount {
   private double balance;
   private String userName;
   private String password;

    public BankAccount(double balance, String userName, String password) {
        this.balance = balance;
        this.userName = userName;
        this.password = password;
    }

    void login(){
        System.out.println("Login to bank account");
   }
    void transferFunds(){
        System.out.println("Transferring funds");
    }
    void resetPassword(){
        System.out.println("Reset the password");
    }
    double getBalance(){
        return balance;
    }
    void setBalance(){
      this.balance= 25000;
    }
}
