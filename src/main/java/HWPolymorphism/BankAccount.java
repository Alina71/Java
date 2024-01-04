package HWPolymorphism;
/*
Banking System Task: Design a BankAccount class with subclasses SavingsAccount,
 CheckingAccount, and FixedDepositAccount.
Common attributes might include accountNumber, balance, and accountHolderName.
Override methods like withdraw and deposit in each subclass to handle specific rules.
Introduce unique methods like applyInterest in SavingsAccount.
Create objects of each type, store them in a list, and perform
operations like depositing and withdrawing funds.
 */

public class BankAccount {
    private String accountHolderName;
    private int accountNumber;
    private double balance;

    public BankAccount(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;

    }

    public void printInfo() {
        System.out.println(accountHolderName + " " + accountNumber + " " + balance);
    }

    public void withdraw(double money) {
        double finalBalance = balance - money;
        if (finalBalance >= balance) {
            System.out.println("The remaining balance after withdraw is " + finalBalance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void deposit(double money) {
        double finalBalance = balance + money;
        System.out.println("The balance after deposit is " + finalBalance);
    }
}
     class SavingsAccount extends BankAccount {
        public SavingsAccount(String accountHolderName, int accountNumber, double balance, double procent) {
            super(accountHolderName, accountNumber, balance);
            this.procent = procent;
            this.balance=balance;
        }

        @Override
        public void printInfo() {
            super.printInfo();
        }


        @Override
        public void withdraw(double money) {
            System.out.println("Send notification if balance is withdraw from the account");
        }

        @Override
        public void deposit(double money) {
            System.out.println("Send notification when is deposit made");
        }

        private final double procent;
        double balance;

        public void applyInterest(double money) {
            double interest =balance+(balance *procent);
            System.out.println("The balance after interest is " + interest);
            System.out.println("******************************");
        }

    }
         class CheckingAccount extends BankAccount {
            public CheckingAccount(String accountHolderName, int accountNumber, double balance) {
                super(accountHolderName, accountNumber, balance);
            }

            @Override
            public void printInfo() {
                super.printInfo();
            }

            @Override
            public void withdraw(double money) {
                System.out.println("Send notification if balance is under 2000");
            }

            @Override
            public void deposit(double money) {
                System.out.println("Transfer to saving account every month 500$");
                System.out.println("******************************");
            }
        }

         class FixedDepositAccount extends BankAccount {
            public FixedDepositAccount(String accountHolderName, int accountNumber, double balance) {
                super(accountHolderName, accountNumber, balance);
            }

            @Override
            public void printInfo() {
                super.printInfo();
            }


            @Override
            public void withdraw(double money) {
                System.out.println("The money from the account can't be withdrawn");
            }

            @Override
            public void deposit(double money) {
                System.out.println("Transfer to the account every month 200$");
            }
        }

