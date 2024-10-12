package point;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(); // Default point at (0, 0)
        Point p2 = new Point(3, 4); // Point at (3, 4)
        Point p3 = new Point(7, 1); // Point at (7, 1)

        // Test getX, getY, setX, setY
        System.out.println("Initial p1 x: " + p1.getX()); // 0
        System.out.println("Initial p1 y: " + p1.getY()); // 0
        p1.setX(5);
        p1.setY(6);
        System.out.println("Updated p1 x: " + p1.getX()); // 5
        System.out.println("Updated p1 y: " + p1.getY()); // 6

        // Test distance methods
        System.out.println("Distance from p2 to (0, 0): " + p2.distance()); // Should be 5.0 (3-4-5 triangle)
        System.out.println("Distance from p2 to p3: " + p2.distance(p3)); // Should be ~5.0 (calculated from (3, 4) to (7, 1))
        System.out.println("Distance from p2 to (1, 1): " + p2.distance(1, 1)); // Should be ~3.605

        // Additional test cases
        Point p4 = new Point(0, 0);
        System.out.println("Distance from p4 to origin: " + p4.distance()); // Should be 0.0

        Point p5 = new Point(10, 10);
        System.out.println("Distance from p5 to p4: " + p5.distance(p4)); // Should be ~14.142

        // Test distance between points using coordinates
        System.out.println("Distance from p1 to (10, 10): " + p1.distance(10, 10)); // Test distance method with (10, 10)
    }
}
