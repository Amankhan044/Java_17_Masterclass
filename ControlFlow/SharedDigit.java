
package ControlFlow;

public class SharedDigit {
    // write code here
    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {

        if ((firstNumber >= 10 && firstNumber <= 99) && (secondNumber >= 10 && secondNumber <= 99)) {

            int firstLeftDigit = firstNumber / 10;
            int firstRightDigit = firstNumber % 10;
            int secondLeftDigit = secondNumber / 10;
            int secondRightDigit = secondNumber % 10;
            boolean firstShared = firstLeftDigit == secondLeftDigit || firstLeftDigit == secondRightDigit;
            boolean secondShared = firstRightDigit == secondLeftDigit || firstRightDigit == secondRightDigit;

            return firstShared || secondShared;

        } else
            return false;

    }
}