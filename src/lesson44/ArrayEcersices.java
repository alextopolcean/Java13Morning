package lesson44;

public class ArrayEcersices {
    public static void main(String[] args) {
        System.out.println(maxSpan(new int[]{1, 2, 1, 1, 3}));
        verglechElementFeld(new int[]{1, 2, 1, 1, 3});

    }


    // Consider the leftmost and righmost appearances of some value in an array.
    // We’ll say that the “span” is the number of elements between the two inclusive.
    // A single value has a span of 1. Returns the largest span found in the given array. (Efficiency is not a priority.)
    /* Условие задачи - ищем самый большой диапазон для любого элемента из массива, а не только для первого или последнего элементов.

Массив может быть гораздо длиннее и бОльшее расстояние может находиться и в середине массива. Мы и ищем бОльшее расстояние между одинаковыми элементами на любых позициях.

Consider the leftmost and righmost appearances of some value in an array. Перевод: “Сравните самое левое и самое правое появление какого-либо значения в массиве. "

We’ll say that the “span” is the number of elements between the two inclusive. Перевод: “Назовём “интервалом” (span) количество элементов между двумя одинаковыми элементами, включая эти элементы.”

A single value has a span of 1. Returns the largest span found in the given array. Перевод: “У единичного значения интервал 1. Верните больший интервал в заданном массиве.” (Efficiency is not a priority.)
     */

    private static int maxSpan(int[] input) {
        int value = 0;
        int span = 0;
        for (int i = 0; i < input.length; i++) {

        }
        return 0;
    }

    private static void verglechElementFeld(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {

        }


    }
}
