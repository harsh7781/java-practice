package OOP;

public class CurrentAccount extends Account{
    public CurrentAccount(long accNum, double balance) {
        super(accNum, balance);
    }

    @Override
    public void deposit(double amount) {
        if(amount > 0) balance += amount;
    }

    @Override
    public void withdraw(double amt) {
        final double overdraftLimit = 1000;
        if (balance - amt >= -overdraftLimit) {
            balance -= amt;
        } else {
            System.out.println("Withdrawal denied! Exceeded overdraft limit.");
        }
    }
}
