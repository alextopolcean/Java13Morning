package lesson44;

import java.util.Arrays;

public class BestBubbleSort {
    public static void main(String[] args) {
        int[] array = createArray(20);
        System.out.println("Оригинал массива => " + Arrays.toString(array));
        bubbleSort(array);
        int[] newArray = myNewCopyArray(array);
        int[] newArray1 = myNewCopyArray(array);
        System.out.println("Bubble sort   => " + Arrays.toString(bubbleSort(newArray)));
        System.out.println("Cocktail sort => " + Arrays.toString(cocktailSort(array)));
    }

    private static int[] cocktailSort(int[] array) {
        int count = 0;

        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            boolean swapped = false;
            for (int i = array.length - 1; i > start; i--) {
                for (int j = start; j < end; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                        swapped = true;

                    }
                }
            }
            end--;
            for (int k = end; k > start; k--) {
                if (array[k] < array[k - 1]) {
                    int temp = 0;
                    array[k - 1] = array[k];
                    array[k] = temp;
                    swapped = true;

                }
            }
            start++;
            count++;
            if (swapped)
                System.out.println(count);
        }
        return array;
    }

    private static int[] myNewCopyArray(int[] array) {
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];

        }

        return copy;
    }

    private static int[] bubbleSort(int[] array) {
        int[] output = new int[array.length];
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
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

    private static int[] createArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random() * length);
        }
        return array;
    }
}
