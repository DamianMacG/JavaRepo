package customer;

public class Main {

    public static void main(String[] args) {
        Customer customer1 = new Customer("Alice", 7000, "alice@example.com");
        Customer customer2 = new Customer("Bob", "bob@example.com");
        Customer customer3 = new Customer();

        // Print out customer details
        System.out.println(customer1.getCustomerInfo());
        System.out.println(customer2.getCustomerInfo());
        System.out.println(customer3.getCustomerInfo());

        // Update and print updated customer details
        customer1.updateCreditLimit(9000);
        customer1.updateEmail("alice.new@example.com");
        System.out.println("Updated " + customer1.getCustomerInfo());
    }
}
