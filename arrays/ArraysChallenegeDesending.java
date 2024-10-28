package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysChallenegeDesending {

    public int[] getIntegers(int len) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();

        }
        return array;

    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        Arrays.sort(array);
        int[] desendedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            desendedArray[i] = array[array.length - 1 - i];
        }
        return desendedArray;
    }

}
