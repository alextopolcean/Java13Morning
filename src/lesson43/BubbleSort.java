package lesson43;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = createArray(10);
        System.out.println(Arrays.toString(array));
        bubbleSort(array);
        System.out.println(Arrays.toString(array));

    }

    private static int[] createArray(int n) {
        int[] output = new int[n];
        for (int i = 0; i < n; i++) {
            output[i] = (int) (Math.random() * 100);

        }
        return output;
    }

    private static int[] bubbleSort(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            int temp = array[i];
            if(array[i]>array[i+1]){
                array[i] = array[i+1];
                array[i+1]=temp;
                count++;

            }

        }
        if(count>0){
            bubbleSort(array);
        }

        return array;
    }
}
