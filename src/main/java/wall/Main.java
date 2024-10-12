package wall;

public class Main {
    public static void main(String[] args) {
        // Create a wall using the default constructor
        Wall defaultWall = new Wall();
        System.out.println("Default Wall: " + defaultWall);

        // Create a wall using the parameterised constructor
        Wall parameterisedWall = new Wall(5.0, 3.0);
        System.out.println("Parameterised Wall: " + parameterisedWall);

        // Test setting positive dimensions
        parameterisedWall.setWidth(10.0);
        parameterisedWall.setHeight(5.0);
        System.out.println("Updated Parameterised Wall: " + parameterisedWall);

        // Test setting negative dimensions
        parameterisedWall.setWidth(-2.0);
        parameterisedWall.setHeight(-4.0);
        System.out.println("After setting negative dimensions: " + parameterisedWall);

        // Create a wall with negative dimensions
        Wall negativeWall = new Wall(-5.0, -3.0);
        System.out.println("Wall with negative dimensions: " + negativeWall);

        // Create a wall with one negative dimension
        Wall mixedDimensionWall = new Wall(4.0, -2.0);
        System.out.println("Mixed Dimension Wall: " + mixedDimensionWall);

        // Create a wall with a very large size
        Wall largeWall = new Wall(100.0, 50.0);
        System.out.println("Large Wall: " + largeWall);
    }
}
