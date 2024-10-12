package point;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PointTest {


    @Test
    public void testDefaultConstructor() {
        Point p1 = new Point();
        assertEquals(0, p1.getX());
        assertEquals(0, p1.getY());
    }

    @Test
    public void testParameterizedConstructor() {
        Point p2 = new Point(3, 4);
        assertEquals(3, p2.getX());
        assertEquals(4, p2.getY());
    }

    @Test
    public void testSetXAndSetY() {
        Point p1 = new Point();
        p1.setX(5);
        p1.setY(6);
        assertEquals(5, p1.getX());
        assertEquals(6, p1.getY());
    }

    @Test
    public void testDistanceToOrigin() {
        Point p2 = new Point(3, 4);
        assertEquals(5.0, p2.distance(), 0.0001);  // 3-4-5 triangle
    }

    @Test
    public void testDistanceBetweenPoints() {
        Point p2 = new Point(3, 4);
        Point p3 = new Point(7, 1);
        assertEquals(5.0, p2.distance(p3), 0.0001); // Distance between (3,4) and (7,1)
    }

    @Test
    public void testDistanceToCoordinates() {
        Point p2 = new Point(3, 4);
        assertEquals(3.605, p2.distance(1, 1), 0.001); // Distance between (3,4) and (1,1)
    }

    @Test
    public void testDistanceFromZero() {
        Point p4 = new Point(0, 0);
        assertEquals(0.0, p4.distance(), 0.0001);  // Distance to itself
    }

    @Test
    public void testDistanceBetweenFarPoints() {
        Point p5 = new Point(10, 10);
        Point p6 = new Point(0, 0);
        assertEquals(14.142, p5.distance(p6), 0.001); // Distance between (10, 10) and (0, 0)
    }
}
