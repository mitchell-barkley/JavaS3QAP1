package Problem1;

public class Account {
    private String id;
    private String name;
    private double balance;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0.0;
    }

    public Account(String id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {

        return balance;
    }

    public double Credit(double amount) {
        if (amount > 0.0) {
            balance = balance + amount;
        }
        return balance;
    }

    public double Debit(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    public double TransferTo(Account another, double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            another.balance = another.balance + amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    public String toString() {
        return "" + balance;
    }
}