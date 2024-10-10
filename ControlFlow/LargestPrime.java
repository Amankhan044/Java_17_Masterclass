package ControlFlow;

public class LargestPrime {

    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }

        int divisor = 2;
        while (divisor <= number) {
            if (number % divisor == 0) {
                number /= divisor;
            } else {
                divisor++;
            }
        }
        System.out.println(divisor);
        return divisor; // The last divisor is the largest prime factor
    }
}