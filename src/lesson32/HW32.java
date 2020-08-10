package lesson32;

import java.util.Arrays;

public class HW32 {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(midThree(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(midThree(new int[]{8, 6, 7, 5, 6, 0, 9})));
        System.out.println(Arrays.toString(midThree(new int[]{1, 2, 3})));
        System.out.println("................");
        System.out.println((unlucky1(new int[]{1, 3, 4, 5})));
        System.out.println((unlucky1(new int[]{2, 1, 3, 4, 5})));
        System.out.println((unlucky1(new int[]{1, 1, 1,})));
        System.out.println("................");
        System.out.println(sameFirstLast(new int[]{1, 2, 3}));
        System.out.println(sameFirstLast(new int[]{1, 2, 3, 1}));
        System.out.println(sameFirstLast(new int[]{1, 2, 1}));
        System.out.println("................");
        System.out.println(sum3(new int[]{1, 2, 3}));
        System.out.println(sum3(new int[]{5, 11, 2}));
        System.out.println(sum3(new int[]{7, 0, 0}));
        System.out.println("................");
        System.out.println(Arrays.toString(maxEnd3(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(maxEnd3(new int[]{11, 2, 9})));
        System.out.println(Arrays.toString(maxEnd3(new int[]{2, 11, 3})));
        System.out.println("................");
        System.out.println(Arrays.toString(makeEnds(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(makeEnds(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(makeEnds(new int[]{7, 4, 6, 2})));


    }

    // Given an array of ints of odd length, return a new array length 3 containing the elements
    // from the middle of the array. The array length will be at least 3.

    // Дан массив нечетной длины, верните новый массив длиной 3,
    // содержащий элементы из середины массива. Длина массива будет не менее 3.

    //midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
    //midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
    //midThree([1, 2, 3]) → [1, 2, 3]

    public static int[] midThree(int[] nums) {


        int[] myArray = new int[3];
        int mitte = nums.length / 2;
        myArray[0] = nums[mitte - 1];
        myArray[1] = nums[mitte];
        myArray[2] = nums[mitte + 1];

        //System.out.println(myArray[0] + " " + myArray[1] + " " + myArray[2]);
        return myArray;


    }

    // We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1.
    // Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.

    // Мы скажем, что 1, за которой следует 3 в массиве, является «неудачным» 1. Верните true, если данный массив
    // содержит неудачный 1 в первых 2 или последних 2 позициях в массиве.

    // unlucky1([1, 3, 4, 5]) → true
    // unlucky1([2, 1, 3, 4, 5]) → true
    // unlucky1([1, 1, 1]) → false

    public static boolean unlucky1(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 1 && nums[i + 1] == 3)
                return true;
        }
        return false;
    }

    // Given an array of ints, return true if the array is length 1 or more,
    // and the first element and the last element are equal.
    // Для данного массива целых чисел вернуть true, если массив имеет длину 1 или более,
    // и первый элемент и последний элемент равны.

    // sameFirstLast({1, 2, 3}) → false
    //sameFirstLast({1, 2, 3, 1}) → true
    //sameFirstLast({1, 2, 1}) → true

    public static boolean sameFirstLast(int[] nums) {
        if (nums.length > 0 && nums[0] == nums[nums.length - 1])
            return true;
        else
            return false;


    }

    // Given an array of ints length 3, return the sum of all the elements.
    // Если задан массив длиной 3 дюйма, вернуть сумму всех элементов.

    // sum3([1, 2, 3]) → 6
    // sum3([5, 11, 2]) → 18
    // sum3([7, 0, 0]) → 7

    public static int sum3(int[] array) {
        return array[0] + array[1] + array[2];
    }

    // Given an array of ints length 3, figure out which is larger, the first or last element in the array,
    // and set all the other elements to be that value. Return the changed array.

    // Учитывая массив длиной 3 дюйма, определите, какой из них больше, первый или последний элемент в массиве,
    // и установите для всех остальных элементов это значение. Вернуть измененный массив.

    // make2([4, 5], [1, 2, 3]) → [4, 5]
    // make2([4], [1, 2, 3]) → [4, 1]
    // make2([], [1, 2]) → [1, 2]

    public static int[] maxEnd3(int[] array) {
        if (array[0] > array[array.length - 1]) {
            fillArray(array, array[0]);

        } else if (array[0] < array[array.length - 1]) {
            Arrays.fill(array, array[array.length - 1]);
        }

        return array;
    }

    public static int[] fillArray(int[] input, int value) {
        for (int i = 0; i < input.length; i++) {
            input[i] = value;

        }
        return input;
    }

    // Given an array of ints, return a new array length 2 containing the first and last elements from the original array.
    // The originalarray will be length 1 or more.
    // Для данного массива целых чисел вернуть новый массив длиной 2, содержащий первый и последний элементы из исходного массива.
    // Исходный массив будет иметь длину 1 или более.

    // makeEnds([1, 2, 3]) → [1, 3]
    // makeEnds([1, 2, 3, 4]) → [1, 4]
    // makeEnds([7, 4, 6, 2]) → [7, 2]

    public static int[] makeEnds(int[] input) {
        int[] output = new int[2];
        output[0] = input[0];
        output[output.length - 1] = input[input.length - 1];

        return output;
    }
}


