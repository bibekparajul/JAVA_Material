public class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Accessor methods
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    // Mutator methods
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    // Method to deposit funds
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid amount for deposit.");
        }
    }

    // Method to withdraw funds
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds or invalid amount for withdrawal.");
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        // Creating a BankAccount object
        BankAccount account = new BankAccount(123456789, "Bibek PARAJULI", 1000.0);

        // Displaying initial account details
        System.out.println("Initial Account Details:");
        account.displayAccountDetails();
        System.out.println();

        // Depositing funds
        account.deposit(500.0);
        System.out.println();

        // Withdrawing funds
        account.withdraw(200.0);
        System.out.println();

        // Displaying updated account details
        System.out.println("Updated Account Details:");
        account.displayAccountDetails();
    }
}
