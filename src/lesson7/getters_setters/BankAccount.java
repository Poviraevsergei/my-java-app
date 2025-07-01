package lesson7.getters_setters;

public class BankAccount {
    private String accountNumber;
    private int balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    void deposit(int amount) {
        balance += amount;
    }

    boolean withdraw(int amount) {
        if (balance < amount) {
            System.out.println("No money no honey..");
            return false;
        }
        balance -= amount;
        return false;
    }
}
