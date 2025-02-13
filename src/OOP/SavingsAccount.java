package OOP;

public class SavingsAccount extends Account{

    public SavingsAccount(long accNum, double balance) {
        super(accNum, balance);
    }

    @Override
    public void deposit(double amount) {
        if(amount > 0) balance += amount;
    }

    @Override
    public void withdraw(double amt) {
        double minBalance = 500;
        if (balance - amt >= minBalance) {
            balance -= amt;
        } else {
            System.out.println("Withdrawal denied! Minimum balance of INR 500 must be maintained.");
        }
    }
}
