
import Polymorphism.polymorphismchallenge.Cars;

@SuppressWarnings("unused")
public class Main {
    public static void main(String[] args) {
        Cars cars = new Cars(8, "Base car");
        raceCars(cars);

        Cars mitsubishi = new Cars.Mitsubishi(8, "Base car");
        raceCars(mitsubishi);

    }

    public static void raceCars(Cars mitsubishi) {
        mitsubishi.accelerate();
        mitsubishi.brake();
        mitsubishi.startEngine();

    }
}
