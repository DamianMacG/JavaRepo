package animal;

public class Animal {
    protected String type;
    private String size;
    private double weight;


    public Animal(String size, String type, double weight) {
        this.size = size;
        this.type = type;
        this.weight = weight;
    }

    public Animal() {

    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void move(String speed) {
        System.out.println(type + " moves " + speed);
    }

    public void makeNoise() {
        System.out.println(type + " makes some kind of sound");
    }
}
