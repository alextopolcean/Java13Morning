public class ArrayFeldMassiv {
    public static void main(String[] args) {
        int[] var1 = new int[]{1, 2, 6};
        int[] var2 = new int[]{6, 1, 2, 3};
        int[] var3 = new int[]{13, 6, 1, 2, 3};
        System.out.println(firstLast6(var1)); // true
        System.out.println(firstLast6(var2)); // true
        System.out.println(firstLast6(var3)); // false

    }

    /*
    Given an array of ints, return true if 6 appears as either the first or last element in the array.
    The array will be length 1 or more.
    Дан массив int. Верните true, если цифра 6 является значением в первом или последнем элементе массива.
    Массив будет длиной больше, либо равной единице.
    firstLast6([1, 2, 6]) → true
    firstLast6([6, 1, 2, 3]) → true
    firstLast6([13, 6, 1, 2, 3]) → false
     */
    private static boolean firstLast6(int[] myArray) {
        if (myArray[0] == 6 || myArray[myArray.length - 1] == 6 ){

            return true;
        }

        return false;
    }
}
