class BankAccount {
    String accountNumber
    double balance

    BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber
        this.balance = initialBalance
    }

    void deposit(double amount) {
        balance += amount
        println "Deposit of $amount successful. New balance: $balance"
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount
            println "Withdrawal of $amount successful. New balance: $balance"
        } else {
            println "Insufficient funds. Withdrawal cancelled."
        }
    }
    
    void withdraw_2(double amount) {
        if (amount <= balance) {
            balance -= amount
            println "Withdrawal of $amount successful. New balance: $balance"
        } else {
            println "Insufficient funds. Second withdrawal cancelled."
        }
    }
    void displayBalance() {
        println "Account: $accountNumber, Balance: $balance"
    }
}
