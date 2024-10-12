package customer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CustomerTest {

    @Test
    void testDefaultConstructor() {
        Customer customer = new Customer();
        assertEquals("Damian", customer.getName());
        assertEquals(10000, customer.getCreditLimit());
        assertEquals("damian@damian.com", customer.getEmail());
    }

    @Test
    void testConstructorWithAllFields() {
        Customer customer = new Customer("John", 20000, "john@example.com");
        assertEquals("John", customer.getName());
        assertEquals(20000, customer.getCreditLimit());
        assertEquals("john@example.com", customer.getEmail());
    }

    @Test
    void testConstructorWithNameAndEmail() {
        Customer customer = new Customer("Alice", "alice@example.com");
        assertEquals("Alice", customer.getName());
        assertEquals(5000, customer.getCreditLimit()); // Default credit limit
        assertEquals("alice@example.com", customer.getEmail());
    }

    @Test
    void testUpdateCreditLimit() {
        Customer customer = new Customer("Bob", 15000, "bob@example.com");
        customer.updateCreditLimit(20000);
        assertEquals(20000, customer.getCreditLimit());
    }

    @Test
    void testUpdateEmail() {
        Customer customer = new Customer("Charlie", 12000, "charlie@example.com");
        customer.updateEmail("charlie.new@example.com");
        assertEquals("charlie.new@example.com", customer.getEmail());
    }

    @Test
    void testInvalidEmailUpdate() {
        Customer customer = new Customer("Eve", 13000, "eve@example.com");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            customer.updateEmail("invalid-email");
        });
        assertEquals("Invalid email address", exception.getMessage());
    }

    @Test
    void testInvalidCreditLimitUpdate() {
        Customer customer = new Customer("Frank", 14000, "frank@example.com");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            customer.updateCreditLimit(-5000);
        });
        assertEquals("Credit limit must be non-negative", exception.getMessage());
    }
}