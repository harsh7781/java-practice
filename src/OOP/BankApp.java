package OOP;

public class BankApp {

    public static void main(String[] args) {
        Person smith = new Person("Smith", 20);
        Person kathy = new Person("Kathy", 40);

        smith.setAccount(new Account(123456789, 2000));
        kathy.setAccount(new Account(987654321, 12000));
        System.out.println("Initial Balances:");
        smith.getAccount().displayBalance();
        kathy.getAccount().displayBalance();

        System.out.println("\nPerforming operations:");
        smith.getAccount().deposit(2000);
        kathy.getAccount().withdraw(2000);

        System.out.println("\nUpdated Balances:");
        smith.getAccount().displayBalance();
        kathy.getAccount().displayBalance();
        System.out.println("\nCreating and testing Savings and Current Accounts:");

        SavingsAccount savingsAcc = new SavingsAccount(112244556, 400);
        CurrentAccount currentAcc = new CurrentAccount(998877665, 1200);

        savingsAcc.withdraw(1600);
        savingsAcc.displayBalance();

        currentAcc.withdraw(4000);
        currentAcc.displayBalance();
    }
}
