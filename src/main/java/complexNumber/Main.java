package complexNumber;

public class Main {
    public static void main(String[] args) {
        // Creating complex numbers
        ComplexNumber num1 = new ComplexNumber(5, 3);   // 5 + 3i
        ComplexNumber num2 = new ComplexNumber(4, 2);   // 4 + 2i
        ComplexNumber num3 = new ComplexNumber(3, 1);   // 3 + 1i
        ComplexNumber num4 = new ComplexNumber(-1, 2);  // -1 + 2i

        // Display initial complex numbers
        System.out.println("Initial Complex Numbers:");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
        System.out.println("num3: " + num3);
        System.out.println("num4: " + num4);
        System.out.println();

        // Test addition of two complex numbers
        num1.add(num2);
        System.out.println("After adding num1 and num2: " + num1);  // Should print 9.0 + 5.0i

        // Reset num1 for further tests
        num1 = new ComplexNumber(5, 3);

        // Test addition of real and imaginary parts
        num1.add(2, 4);
        System.out.println("After adding 2 + 4i to num1: " + num1);  // Should print 7.0 + 7.0i

        // Test subtraction of two complex numbers
        num3.subtract(num4);
        System.out.println("After subtracting num4 from num3: " + num3);  // Should print 4.0 - 1.0i

        // Reset num3 for further tests
        num3 = new ComplexNumber(3, 1);

        // Test subtraction of real and imaginary parts
        num3.subtract(1, 1);
        System.out.println("After subtracting 1 + 1i from num3: " + num3);  // Should print 2.0 + 0.0i

        // Further tests with addition and subtraction
        ComplexNumber num5 = new ComplexNumber(2, -3);  // 2 - 3i
        ComplexNumber num6 = new ComplexNumber(1, 4);   // 1 + 4i

        System.out.println("Initial Complex Numbers for further tests:");
        System.out.println("num5: " + num5);
        System.out.println("num6: " + num6);
        System.out.println();

        // Adding num5 and num6
        num5.add(num6);
        System.out.println("After adding num5 and num6: " + num5);  // Should print 3.0 + 1.0i

        // Subtracting num6 from num5
        num5.subtract(num6);
        System.out.println("After subtracting num6 from the result: " + num5);  // Should return to 2.0 - 3.0i
    }
}

