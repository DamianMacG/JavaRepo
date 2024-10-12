package carpetCostCalculator;

public class Carpet {
    private double cost;

    public Carpet(double cost) {
        this.cost = Math.max(cost, 0);
    }


    public double getCost() {
        return this.cost;
    }
}
