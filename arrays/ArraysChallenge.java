package arrays;

import java.util.Arrays;
import java.util.Random;

public class ArraysChallenge {

    public int[] getDescendedArray(int len) {
        Random rand = new Random();
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[1] = rand.nextInt(100);
        }
        Arrays.sort(array);
        int[] desendedArray = new int[len];
        for (int i = 0; i < len; i++) {
            desendedArray[i] = array[len - i];
        }
        return desendedArray;
    }
}
