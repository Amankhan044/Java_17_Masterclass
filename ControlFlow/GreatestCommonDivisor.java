package ControlFlow;

public class GreatestCommonDivisor {

    public static boolean isValid(int value) {
        System.out.println("invalid value");

        return value < 10;
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (isValid(first) && isValid(second)) {
            System.out.println("invalid value");
            return -1;

        }
        int min = Math.min(first, second);
        int largestDivisor = 0;
        for (int i = 1; i <= min - 1; i++) {
            if (first % i == 0 && second % i == 0) {
                largestDivisor = i;
                System.out.println(largestDivisor);

            }

        }

        return largestDivisor;

    }

}
