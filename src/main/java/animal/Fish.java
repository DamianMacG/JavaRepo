package animal;

public class Fish extends Animal {
    private int gills;
    private int fins;

    public Fish(String type, double weight, int fins, int gills) {
        super("small", type, weight);
        this.fins = fins;
        this.gills = gills;
    }

    private void moveMuscles() {
        System.out.print("Muscles moving ");
    }

    private void moveBackFin() {
        System.out.print("Back fin moving ");
    }


    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        if (speed == "fast") {
            moveBackFin();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Fish{" +
                "gills=" + gills +
                ", fins=" + fins +
                "} " + super.toString();
    }
}
