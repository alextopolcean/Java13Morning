import java.util.Arrays;

public class HW43 {

    // Cocktail sort
    // Создать случайный массив byte, длиной N.
    // Вывести его на экран.
    // Отсортировать его пузырьковой сортировкой.
    // Вывести его на экран.
    // Отсортировать первоначальный массив коктейльной сортировкой..
    // Вывести его на экран.
    // Ссылку на решение оставить в комментариях.

    public static void main(String[] args) {
        byte[] array = createByteArray(25);
        System.out.println("Случайный массив длиной  " + array.length + "      => " + Arrays.toString(array));
        System.out.println("Сортировка массива Bubble Sort   => " + Arrays.toString(bubbleSort(array)));
        System.out.println("Сортировка массива Cocktail Sort => " + Arrays.toString(cocktailSort(array)));
    }

    public static byte[] createByteArray(int n) {
        byte[] array = new byte[n];
        for (int i = 0; i < n; i++) {
            array[i] = (byte) (Math.random() * n + 1);
        }

        return array;
    }

    public static byte[] bubbleSort(byte[] array) {
        int count = 0;
        for (byte i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                byte temp = array[i];
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

    private static byte[] cocktailSort(byte[] array) {
        byte count = 0;
        byte start = 0;
        byte end = (byte) (array.length - 1);
        while (start <= end) {
            boolean swapped = false;
            for (int i = start; i < end; i++) {
                if (array[i] > array[i + 1]) {
                    byte temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
            end--;
            for (int j = end; j > start; j--) {
                if (array[j] < array[j - 1]) {
                    byte temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                    swapped = true;
                }
            }
            start++;
            count++;
            if (!swapped) {
                break;
            }
        }
        return array;
    }

}

