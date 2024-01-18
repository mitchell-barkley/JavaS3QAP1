package Problem1;

public class TestAccount {
    public static void main(String[] args) {
        Account acc1 = new Account("A101", "NL Chocolate", 5000.00);
        Account acc2 = new Account("A102", "NL Coffee", 4000.00);

        System.out.println("Account 1 Balance: " + acc1);
        System.out.println("Account 2 Balance: " + acc2);

        acc1.TransferTo(acc2, 1000.00);

        System.out.println("Account 1 Balance: " + acc1);
        System.out.println("Account 2 Balance: " + acc2);
    }
}
