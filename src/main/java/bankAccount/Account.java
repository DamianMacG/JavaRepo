package bankAccount;

public class Account {
    private double balance;
    private int accountNumber;
    private String name;
    private String email;
    private String phoneNumber;

    public Account() {
        this(500.0, "DEEDEE", "dee.dee@example.com", "1234567890", 1001);
        System.out.println("Helloooooo");
    }

    public Account(double balance, String name, String email, String phoneNumber, int accountNumber) {
        System.out.println("Byyyeeeeee");
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Account(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double input) {
        balance += input;
        System.out.println("Deposit Successful! New balance = " + balance);
    }

    public void withdrawFunds(double input) {
        if (balance - input < 0) {
            System.out.println("Not enough funds!!! - " + balance);
        } else {
            balance -= input;
            System.out.println("Withdrawal successfull! New balance = " + balance);
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}