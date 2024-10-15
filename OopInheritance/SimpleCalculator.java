package OopInheritance;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult() {
        double addResult = firstNumber + secondNumber;
        return addResult;
    }

    public double getSubtractionResult() {
        double subtractionResult = firstNumber - secondNumber;
        return subtractionResult;
    }

    public double getMultiplicationResult() {
        double multiplicationResult = firstNumber * secondNumber;
        return multiplicationResult;
    }

    public double getDivisionResult() {
        if (secondNumber == 0)
            return 0;
        double divisionResult = firstNumber / secondNumber;
        return divisionResult;
    }
}
