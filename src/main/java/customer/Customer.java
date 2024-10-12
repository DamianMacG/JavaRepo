package customer;

public class Customer {
    private String name;
    private int creditLimit;
    private String email;

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public Customer(String name, int creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public Customer() {
        this("Damian", 10000, "damian@damian.com");
    }

    public Customer(String name, String email) {
        this(name, 5000, email);
    }

    // Method to update credit limit
    public void updateCreditLimit(int newLimit) {
        if (newLimit >= 0) {
            this.creditLimit = newLimit;
        } else {
            throw new IllegalArgumentException("Credit limit must be non-negative");
        }
    }

    // Method to update email
    public void updateEmail(String newEmail) {
        if (newEmail != null && newEmail.contains("@")) {
            this.email = newEmail;
        } else {
            throw new IllegalArgumentException("Invalid email address");
        }
    }

    // Method to get customer information
    public String getCustomerInfo() {
        return String.format("Name: %s, Credit Limit: %d, Email: %s", name, creditLimit, email);
    }
}
