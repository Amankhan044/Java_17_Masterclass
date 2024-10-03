import ExpressionStatements.BarkingDog;
import ExpressionStatements.DecimalComparator;

public class Main {
    public static void main(String[] args) {
        boolean isBarking = true;
        int hourOfDay = 23;
        boolean shouldWakeUp = BarkingDog.shouldWakeUp(isBarking, hourOfDay);
        System.out.println(shouldWakeUp);

        double firstNumber = 3.1756;
        double secondNumber = 3.175;
        boolean result = DecimalComparator.areEqualByThreeDecimalPlaces(firstNumber, secondNumber);
        System.out.println("Test case 1 - areEqualByThreeDecimalPlaces(3.1756, 3.175): " + result);

    }
}
