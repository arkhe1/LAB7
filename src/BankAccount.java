public class BankAccount {

    private String accountID;
    private double balance;

    public BankAccount(String accountID, double balance) {
        this.accountID = accountID;
        this.balance = balance;
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if(amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
            System.out.println("Do you want to go into borrowing? (yes/no)");
        }
    }

    public void accountDetails() {
        System.out.println("Account ID: " + accountID);
        System.out.println("Balance   : " + balance);
    }
}
