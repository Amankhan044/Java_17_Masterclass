package ControlFlow;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long avg = 0;
        int i = 1;
        while (true) {

            try {
                int number = scanner.nextInt();
                sum += number;
                avg = Math.round((double) sum / i);
                i++;

            } catch (InputMismatchException e) {
                System.out.println("SUM = " + sum + " AVG = " + avg);
                break;
            } finally {
                scanner.nextInt();
            }

        }
        scanner.close();

    }
}
