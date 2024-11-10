package smart_kitchen;


public class Main {

    public static void main(String[] args) {
        SmartKitchen kitchen = new SmartKitchen();

//        kitchen.getDishwasher().setWorkToDo(true);
//        kitchen.getIceBox().setWorkToDo(true);
//        kitchen.getBrewmaster().setWorkToDo(true);
//
//
//        kitchen.getDishwasher().doDishes();
//        kitchen.getIceBox().orderFood();
//        kitchen.getBrewmaster().brewCoffee();

        kitchen.setKitchenState(true, false, true);
        kitchen.doKitchenWork();

    }
}
