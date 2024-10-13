package animal;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", "Huge", 200);
        doAnimalStuff(animal, "slow");

//        Dog dog = new Dog();
//        doAnimalStuff(dog, "fast");

        Dog doggo = new Dog("Doggo", 15);
        doAnimalStuff(doggo, "fast");

        Dog retriever = new Dog("Lab", 65, "Floppy", "Swimmer");
        doAnimalStuff(retriever, "slow");
    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("____");
    }
}
