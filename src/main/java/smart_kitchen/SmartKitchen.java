package smart_kitchen;

public class SmartKitchen {

    private CoffeeMaker brewmaster;
    private Refrigerator iceBox;
    private Dishwasher dishwasher;

    public SmartKitchen() {
        brewmaster = new CoffeeMaker();
        iceBox = new Refrigerator();
        dishwasher = new Dishwasher();
    }

    public CoffeeMaker getBrewmaster() {
        return brewmaster;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public Dishwasher getDishwasher() {
        return dishwasher;
    }

    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag, boolean dishWasherFlag) {
        brewmaster.setWorkToDo(coffeeFlag);
        iceBox.setWorkToDo(fridgeFlag);
        dishwasher.setWorkToDo(dishWasherFlag);
    }

    public void doKitchenWork() {
        brewmaster.brewCoffee();
        iceBox.orderFood();
        dishwasher.doDishes();
    }
}

class CoffeeMaker {
    private boolean hasWorkToDo;

    public void setWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee() {
        if (hasWorkToDo) {
            System.out.println("Brewing Coffee");
            hasWorkToDo = false;
        }
    }
}

class Refrigerator {
    private boolean hasWorkToDo;

    public void setWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood() {
        if (hasWorkToDo) {
            System.out.println("Ordering Food");
            hasWorkToDo = false;
        }
    }
}

class Dishwasher {
    private boolean hasWorkToDo;

    public void setWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes() {
        if (hasWorkToDo) {
            System.out.println("Washing Dishes");
            hasWorkToDo = false;
        }
    }
}

