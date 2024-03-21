package Review10;

public class BankTester {
    public static void main(String[] args) {
        BankAccount b =new BankAccount(9000,"alot","alot123");
        b.setBalance(4500);
        System.out.println(b.getBalance());
    }
}
