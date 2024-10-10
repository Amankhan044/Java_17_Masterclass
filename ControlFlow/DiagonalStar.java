package ControlFlow;

public class DiagonalStar {

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        for (int row = 1; row <= number; row++) {
            for (int col = 1; col <= number; col++) {
                if (row == number || row == 1 ||
                        col == 1 || col == number ||
                        row == col ||
                        col == (number - row + 1)) {
                    System.err.print("*");

                } else {
                    System.out.print(" ");

                }
            }
            System.out.println();
        }
    }
}
