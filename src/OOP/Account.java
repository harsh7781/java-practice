package OOP;

public class Account {
    protected long accNum;
    protected double balance;

    public Account(long accNum, double balance) {
        this.accNum = accNum;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public long getAccNum() {
        return accNum;
    }

    public void deposit(double amount) {
        if(amount > 0) balance += amount;
    }

    public void withdraw(double amt) {
        if(balance >= amt) balance -= amt;
        else System.out.println("Insufficient Funds!!!!");
    }

    public void displayBalance() {
        System.out.println("Account Number: " + accNum + " | Balance: INR " + balance);
    }
}
