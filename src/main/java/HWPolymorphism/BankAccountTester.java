package HWPolymorphism;

public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount[] arr={new SavingsAccount("John Smith",123456654,5963,0.2),
        new CheckingAccount("Rick Burcu",987456654,6589),
        new FixedDepositAccount("Grace Joy",654987789,5698)};
        for(BankAccount BA:arr){
            BA.printInfo();
            BA.withdraw(987.56);
            BA.deposit(564.50);
            if(BA instanceof SavingsAccount){
                SavingsAccount s=(SavingsAccount) BA;
                s.applyInterest(10);
            }
        }
    }
}
