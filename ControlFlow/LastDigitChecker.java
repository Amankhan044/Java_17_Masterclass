package ControlFlow;

public class LastDigitChecker {
    // write code here

    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;

    }

    public static boolean hasSameLastDigit(int first, int second, int third) {
        if (isValid(first) && isValid(second) && isValid(third)) {
            int firstRigtDigit = first % 10;
            int secondRightDigit = second % 10;
            int thirdRightDigit = third % 10;

            return (firstRigtDigit == secondRightDigit) || (firstRigtDigit == thirdRightDigit)
                    || (secondRightDigit == thirdRightDigit);

        } else
            return false;

    }
}