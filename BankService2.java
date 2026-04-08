public class BankService2 {

    // Simple BankAccount class
    static class BankAccount {
        private double balance;

        // Constructor
        BankAccount(double balance) {
            if (balance < 0) throw new IllegalArgumentException("Balance cannot be negative");
            this.balance = balance;
        }

        // Deposit method
        void deposit(double amount) {
            if (amount <= 0) throw new IllegalArgumentException("Deposit must be positive");
            balance += amount;
        }

        // Withdraw method
        void withdraw(double amount) {
            if (amount <= 0 || amount > balance) throw new IllegalArgumentException("Invalid withdrawal");
            balance -= amount;
        }

        // Get balance
        double getBalance() {
            return balance;
        }
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount(5000);

        System.out.println("Initial Balance: " + acc.getBalance());

        acc.deposit(700);
        System.out.println("After deposit: " + acc.getBalance());

        acc.withdraw(300);
        System.out.println("After withdrawal: " + acc.getBalance());
    }
}
