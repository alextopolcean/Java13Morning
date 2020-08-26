package lesson47;

import java.util.Arrays;

public class ClassWork {
    public static void main(String[] args) {
        int[] array = {22, 100, 55, 33, 88, 7};
        System.out.println(Arrays.toString(insertionSort(array)));
    }

    public static int[] insertionSort(int[] input) {
        for (int i = 0; i < input.length; i++) {
            int newElement = input[i]; // временная переменная
            // цикл начался не с нуля, а с единицы. Location предыдущее место от элемента массива.
            int location = i - 1;
            // пока значение LOCATION > значения элемента в проверке
            while (location >= 0 && input[location] > newElement) {
                input[location + 1] = input[location];
                location = location - 1; // декрементация LOCATION
            }
            input[location + 1] = newElement; // значению LOCATION+1 передаём значение из памяти
        }
        return input;
    }
}
