package Polymorphism.polymorphismchallenge;

public class Car {
    private String discription;

    public Car(String discription) {
        this.discription = discription;
    }

    public void startEngine() {
        System.out.println("Car -> startEngine");
    }

    public void drive() {
        System.out.println("Car -> driving, type is " + getClass().getSimpleName());
        runEngine();

    }

    protected void runEngine() {
        System.out.println("Car -> runEngine");

    }
}

class GasPoweredCar extends Car {
    private double avgKmPerLitre;
    private int cylinders = 6;

    public GasPoweredCar(String discription, double avgKmPerLitre, int cylinders) {
        super(discription);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    public GasPoweredCar(String discription) {
        super(discription);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> usage exceeds the average: %.2f %n", avgKmPerLitre);
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %d cylinders are fired up, Ready!%n", cylinders);
    }

}

class ElectricCar extends Car {

    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String discription) {
        super(discription);
    }

    public ElectricCar(String discription, double avgKmPerCharge, int batterySize) {
        super(discription);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    protected void runEngine() {
        System.out.printf("BEV -> usage under the average: %.2f %n", avgKmPerCharge);

    }

    @Override
    public void startEngine() {
        System.out.printf("BEV -> switch %d KWH battery on , Ready!%n", batterySize);
    }

}

class HybridCar extends Car {
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders = 6;

    public HybridCar(String discription) {
        super(discription);
    }

    public HybridCar(String discription, double avgKmPerLitre, int batterySize, int cylinders) {
        super(discription);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    protected void runEngine() {
        System.out.printf("Hybrid -> usage under the average: %.2f %n", avgKmPerLitre);

    }

    @Override
    public void startEngine() {
        System.out.printf("Hybrid -> %d cylinders are fired up.!%n", cylinders);
        System.out.printf("BEV -> switch %d KWH battery on , Ready!%n", batterySize);
    }

}
