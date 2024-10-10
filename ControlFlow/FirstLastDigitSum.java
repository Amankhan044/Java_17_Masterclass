package ControlFlow;

public class FirstLastDigitSum {
    // write code here
    public static int sumFirstAndLastDigit(int number) {

        int lastDigit = number % 10;
        if (number < 0) {
            return -1;
        }

        while (number >= 10) {
            number = number / 10;

        }
        int firstDigit = number;

        return firstDigit + lastDigit;

    }
}