package arrays;

import java.util.Scanner;

public class MinimumElementChallenege {

    private static Scanner scanner = new Scanner(System.in);

    public static int readIntegers() {
        System.out.print("Enter the minimum number of elements you want in the list: ");
        int integer = scanner.nextInt();
        return integer;
    }

    public static int[] readElement(int integer) {
        int[] elements = new int[integer];
        System.out.println("Enter " + integer + " integers:");
        for (int i = 0; i < integer; i++) {
            elements[i] = scanner.nextInt();
        }
        return elements;
    }

    public static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }
        System.out.println(min);
        return min;
    }

}
