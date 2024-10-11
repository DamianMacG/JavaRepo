package bankAccount;

public class Main {

    public static void main(String[] args) {
        Account account1 = new Account(500.0, "John Doe", "john.doe@example.com", "1234567890", 1001);

        // Test 1: Check initial balance
        System.out.println("Initial Balance: " + account1.getBalance());  // Expected: 500.0

        // Test 2: Deposit funds
        account1.depositFunds(200.0);  // Expected: Deposit Successful! New balance = 700.0

        // Test 3: Withdraw funds
        account1.withdrawFunds(100.0);  // Expected: Withdrawal successfull! New balance = 600.0

        // Test 4: Attempt to withdraw more than balance
        account1.withdrawFunds(700.0);  // Expected: Not enough funds!!! - 600.0

        // Test 5: Print account information
        System.out.println("Account Number: " + account1.getAccountNumber());  // Expected: 1001
        System.out.println("Account Holder: " + account1.getName());  // Expected: John Doe
        System.out.println("Email: " + account1.getEmail());  // Expected: john.doe@example.com
        System.out.println("Phone Number: " + account1.getPhoneNumber());  // Expected: 1234567890

        // Test 6: Setting new values
        account1.setName("Jane Smith");
        account1.setEmail("jane.smith@example.com");
        account1.setPhoneNumber("0987654321");
        System.out.println("Updated Account Holder: " + account1.getName());  // Expected: Jane Smith
        System.out.println("Updated Email: " + account1.getEmail());  // Expected: jane.smith@example.com
        System.out.println("Updated Phone Number: " + account1.getPhoneNumber());  // Expected: 0987654321
    }
}
