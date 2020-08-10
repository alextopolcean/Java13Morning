package lesson34;

import java.util.Arrays;

public class Lesson34JavaExercises {
    public static void main(String[] args) {
        int[] a1 = new int[]{4, 5, 6};
        int[] a2 = new int[]{1, 2};
        int[] a3 = new int[]{3};
        System.out.println(Arrays.toString(makeLast(a1)));
        System.out.println(Arrays.toString(makeLast(a2)));
        System.out.println(Arrays.toString(makeLast(a3)));
        System.out.println(".............");
        int[] b1 = new int[]{1, 2, 3};
        int[] b2 = new int[]{1, 3};
        int[] c1 = new int[]{7, 2, 3};
        int[] c2 = new int[]{1};
        int[] d1 = new int[]{1, 2};
        int[] d2 = new int[]{};
        System.out.println(start1(b1, b2));
        System.out.println(start1(c1, c2));
        System.out.println(start1(d1, d2));
        System.out.println(".............");

        /*
        int[] plusTwo1 = new int[]{1, 2};
        int[] plusTwo2 = new int[]{3, 4};
        int[] plusTwo3 = new int[]{4, 4};
        int[] plusTwo4 = new int[]{2, 2};
        int[] plusTwo5 = new int[]{9, 2};
        int[] plusTwo6 = new int[]{3, 4};
         */
        System.out.println(Arrays.toString(plusTwo(new int[]{1, 2}, new int[]{3, 4})));
        System.out.println(Arrays.toString(plusTwo(new int[]{4, 4}, new int[]{2, 2})));
        System.out.println(Arrays.toString(plusTwo(new int[]{9, 2}, new int[]{3, 4})));
        System.out.println(".............");
        System.out.println(Arrays.toString(plusTwoUniversal(new int[]{1, 2}, new int[]{3, 4})));
        System.out.println(Arrays.toString(plusTwoUniversal(new int[]{4, 4}, new int[]{2, 2})));
        System.out.println(Arrays.toString(plusTwoUniversal(new int[]{9, 2}, new int[]{3, 4})));


    }

    // Given an int array, return a new array with double the length where its last element is the same as the original array, and all
    //the other elements are 0. The original array will be length 1 or more. Note: by default, a new int array contains all 0's.

    //Учитывая массив int, верните новый массив с удвоенной длиной, где его последний элемент такой же, как исходный массив,и все
    //остальные элементы равны 0. Исходный массив будет иметь длину 1 или больше. Примечание: по умолчанию новый массив int содержит все 0.

    // makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
    // makeLast([1, 2]) → [0, 0, 0, 2]
    // makeLast([3]) → [0, 3]
    public static int[] makeLast(int[] array) {
        int[] output = new int[array.length * 2];
        output[output.length - 1] = array[array.length - 1];


        return array;
    }

    // Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.

    // Начните с двух массивов int, a и b, любой длины. Возвратите, сколько массивов имеет 1 в качестве первого
    // элемента.

    // start1([1, 2, 3], [1, 3]) → 2
    // start1([7, 2, 3], [1]) → 1
    // start1([1, 2], []) → 1
    public static int start1(int[] a, int[] b) {
        int count = 0;
        if (a.length > 0 && a[0] == 1) {
            count = count + 1;
        } else if (b.length > 0 && b[0] == 1) {
            count++;
        }

        return count;
    }

    // Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.
    // Учитывая 2 массива int, каждый длиной 2, верните новый массив длиной 4, содержащий все их элементы.
    // plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
    // plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
    // plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]

    public static int[] plusTwo(int[] a, int[] b) {
        int[] output = new int[4];
        output[0] = a[0];
        output[1] = a[1];
        output[2] = b[0];
        output[3] = b[1];

        return output;
    }

    public static int[] plusTwoUniversal(int[] a, int[] b) {
        int[] output = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            output[i] = a[i];

        }
        for (int i = 0; i < b.length; i++) {
            output[i] = b[i];

        }
        return a;
    }
}
