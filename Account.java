class Account {
    double balance;
    
    Account() {
        balance = 0;
    }
    
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid operation!");
        }
    }
    
    void withdraw(double amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }
    
    double status() {
        return Math.round(balance * 100) / 100;
    }
}