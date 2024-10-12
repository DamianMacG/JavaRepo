package carpetCostCalculator;

public class Floor {
    private double width;
    private double length;

    public Floor(double width, double length) {
        this.width = Math.max(width, 0);
        this.length = Math.max(length, 0);
    }

    public double getArea() {
        return this.width * this.length;
    }
}
