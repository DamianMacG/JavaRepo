package wall;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WallTest {

    @Test
    public void testDefaultConstructor() {
        Wall wall = new Wall();
        assertEquals(0, wall.getWidth(), "Default width should be 0");
        assertEquals(0, wall.getHeight(), "Default height should be 0");
        assertEquals(0, wall.getArea(), "Default area should be 0");
    }

    @Test
    public void testParameterisedConstructor() {
        Wall wall = new Wall(5.0, 3.0);
        assertEquals(5.0, wall.getWidth(), "Width should be initialised to 5.0");
        assertEquals(3.0, wall.getHeight(), "Height should be initialised to 3.0");
        assertEquals(15.0, wall.getArea(), "Area should be 5.0 * 3.0 = 15.0");
    }

    @Test
    public void testNegativeDimensions() {
        Wall wall = new Wall(-5.0, -3.0);
        assertEquals(0, wall.getWidth(), "Width should be 0 for negative input");
        assertEquals(0, wall.getHeight(), "Height should be 0 for negative input");
        assertEquals(0, wall.getArea(), "Area should be 0 for negative dimensions");
    }

    @Test
    public void testSetWidth() {
        Wall wall = new Wall();
        wall.setWidth(10.0);
        assertEquals(10.0, wall.getWidth(), "Width should be set to 10.0");

        wall.setWidth(-5.0);
        assertEquals(0, wall.getWidth(), "Width should be 0 when set to negative value");
    }

    @Test
    public void testSetHeight() {
        Wall wall = new Wall();
        wall.setHeight(4.0);
        assertEquals(4.0, wall.getHeight(), "Height should be set to 4.0");

        wall.setHeight(-2.0);
        assertEquals(0, wall.getHeight(), "Height should be 0 when set to negative value");
    }

    @Test
    public void testToString() {
        Wall wall = new Wall(5.0, 3.0);
        String expectedString = "Wall{width=5.0, height=3.0, area=15.0}";
        assertEquals(expectedString, wall.toString(), "toString method should return correct string representation");
    }
}
