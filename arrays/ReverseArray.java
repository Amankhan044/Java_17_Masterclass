package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    private static Scanner scanner = new Scanner(System.in);

    public int[] reverseArray(int len) {
        int[] array = new int[len];
        System.out.println("Enter " + len + " elements:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Original array: " + Arrays.toString(array));

        for (int i = 0; i < len / 2; i++) {
            int temp = array[i];
            array[i] = array[len - 1 - i];
            array[len - 1 - i] = temp;
        }

        System.out.println("Reversed array: " + Arrays.toString(array));
        return array;
    }
}
