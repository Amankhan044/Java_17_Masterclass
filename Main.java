import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

@SuppressWarnings("unused")
public class Main {
    public static void main(String[] args) {
        int[] array = getRandomArray(10);
        System.out.println(Arrays.toString(array));

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray));

    }

    private static int[] getRandomArray(int len) {
        // Random rand = new Random();
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = new Random().nextInt(100);

        }
        return array;
    }

}
