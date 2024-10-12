package customer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

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
}