package Person;

public class Main {

    public static void main(String[] args) {
        // Test 1: Create a Person and set first and last name
        Person person1 = new Person();
        person1.setFirstName("John");
        person1.setLastName("Doe");
        person1.setAge(25);

        System.out.println("Full Name: " + person1.getFullName());  // Expected: John Doe
        System.out.println("Is Teen: " + person1.isTeen());         // Expected: false

        // Test 2: Person with only first name
        Person person2 = new Person();
        person2.setFirstName("Jane");
        person2.setAge(17);

        System.out.println("Full Name: " + person2.getFullName());  // Expected: Jane
        System.out.println("Is Teen: " + person2.isTeen());         // Expected: true

        // Test 3: Person with only last name
        Person person3 = new Person();
        person3.setLastName("Smith");
        person3.setAge(30);

        System.out.println("Full Name: " + person3.getFullName());  // Expected: Smith
        System.out.println("Is Teen: " + person3.isTeen());         // Expected: false

        // Test 4: Person with no name and age out of range
        Person person4 = new Person();
        person4.setAge(150);

        System.out.println("Full Name: " + person4.getFullName());  // Expected: ""
        System.out.println("Age: " + person4.getAge());             // Expected: 0
        System.out.println("Is Teen: " + person4.isTeen());         // Expected: false
    }
}
