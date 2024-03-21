package Review10;

public class BankAccount {
    private double balance;
    private String userName;
    private String Password;

    public BankAccount(double balance, String userName, String Password) {
        setPassword(Password);
        setUserName(userName);
        setBalance(balance);
    }
    void setBalance(double balance) {

        if (balance < 0) {
            System.out.println("Wrong Balance amount.");
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }

    void setUserName(String userName) {
        if (userName.length() < 4) {
            System.out.println("Username should be more then 4 characters");
        } else {
            this.userName = userName;
        }
    }

    void setPassword(String password) {
        this.Password = password;
    }

    void transferFunds(double amountToTransfer) {
        balance = balance - amountToTransfer;
    }
    double getBalance() {
    return balance;
}
}

