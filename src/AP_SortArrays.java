import java.util.Arrays;

public class AP_SortArrays {
    public static void main(String[] args) {

        int[] array = createArray(5);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(bubbleSort(array)));
    }

    private static int[] createArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random()*n);

        }
        return array;

    }

    public static int[] bubbleSort(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            int temp = array[i];
            if (array[i] > array[i + 1]) {
                array[i] = array[i + 1];
                array[i + 1] = temp;
                count++;
            }

        }
        if (count > 0) {
            bubbleSort(array);
        }

        return array;
    }
}
