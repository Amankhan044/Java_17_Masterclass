package ControlFlow;

public class Sum3And5Challenge {

    public static void sumThreeAndFive() {
        int counter = 0;
        int sum = 0;

        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println("Found a match: " + i);
                counter++;
                sum += i;
                if (counter == 5) {
                    System.out.println("Sum = " + sum);
                    break;
                }
            }
        }
    }

}
