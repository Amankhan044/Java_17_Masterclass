package Polymorphism.CompositionChallenge;

public class SmartKitchen {
    private Refrigerator iceBox;
    private DishWasher dishWasher;
    private CoffeeMaker brewCoffee;

    public SmartKitchen() {
        brewCoffee = new CoffeeMaker();
        dishWasher = new DishWasher();
        iceBox = new Refrigerator();
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public CoffeeMaker getBrewCoffee() {
        return brewCoffee;
    }

    private void addWater() {
        brewCoffee.setHasWorkToDo(true);
    }

    private void pourMilk() {
        iceBox.setHasWorkToDo(true);
    }

    private void loadDishwasher() {
        dishWasher.setHasWorkToDo(true);
    }

    private void setKitchenState(boolean dishWasher, boolean iceBox, boolean brewCoffee) {
        this.brewCoffee.setHasWorkToDo(brewCoffee);
        this.iceBox.setHasWorkToDo(iceBox);
        this.dishWasher.setHasWorkToDo(dishWasher);

    }

    public void doKitchenWork() {
        brewCoffee.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }

}

class Refrigerator {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood() {
        if (hasWorkToDo) {
            System.out.println("Ordering Food");
            hasWorkToDo = false;
        }

    }
}

class DishWasher {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes() {
        if (hasWorkToDo) {
            System.out.println("Washing Dishes");
            hasWorkToDo = false;
        }
    }

}

class CoffeeMaker {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee() {
        if (hasWorkToDo) {
            System.out.println("Brewing Coffee");
            hasWorkToDo = false;
        }
    }

}
