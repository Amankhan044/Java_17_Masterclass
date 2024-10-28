package arrays;

import java.util.Scanner;
import java.util.Arrays;

public class MinimumElementChallenege {

    public static int[] readIntegers() {
        System.out.print("Entering minimum element you want in the List of elements by comma delimited: -> ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] elements = input.split(",");
        int[] elementsCount = new int[elements.length];
        for (int i = 0; i < elementsCount.length; i++) {
            elementsCount[i] = Integer.parseInt(elements[i].trim());
        }
        scanner.close();
        return elementsCount;

    }

    public static void findMin(int[] arr) {
        int temp;
        boolean flag = true;
        while (flag) {
            int count = 0;
            flag = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    count++;
                    System.out.println(count);
                    flag = true;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
