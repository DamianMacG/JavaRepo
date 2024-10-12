package carpetCostCalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarpetCostCaculatorTest {
    @Test
    public void testFloorArea() {
        // Test positive dimensions
        Floor floor = new Floor(2.75, 4.0);
        assertEquals(11.0, floor.getArea(), 0.001);

        // Test negative dimensions
        Floor floorWithNegative = new Floor(-2.75, 4.0);
        assertEquals(0, floorWithNegative.getArea(), 0.001);
    }

    @Test
    public void testCarpetCost() {
        // Test positive cost
        Carpet carpet = new Carpet(3.5);
        assertEquals(3.5, carpet.getCost(), 0.001);

        // Test negative cost
        Carpet carpetWithNegative = new Carpet(-3.5);
        assertEquals(0, carpetWithNegative.getCost(), 0.001);
    }

    @Test
    public void testCalculatorTotalCost() {
        // Test 1: valid floor and carpet cost
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        assertEquals(38.5, calculator.getTotalCost(), 0.001);

        // Test 2: valid floor and different carpet cost
        Carpet carpet2 = new Carpet(1.5);
        Floor floor2 = new Floor(5.4, 4.5);
        Calculator calculator2 = new Calculator(floor2, carpet2);
        assertEquals(36.45, calculator2.getTotalCost(), 0.001);
    }
}
