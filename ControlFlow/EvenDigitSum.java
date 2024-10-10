package ControlFlow;

public class EvenDigitSum {
    // write code here
    public static int getEvenDigitSum(int number) {
        int sum = 0;
        if (number < 0) {
            return -1;
        }
        while (number != 0) {
            int lastDigit = number % 10;
            number = number / 10;
            if (lastDigit % 2 == 0) {

                sum += lastDigit;
            }

        }

        return sum;
    }
}