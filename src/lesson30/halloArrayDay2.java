package lesson30;

public class halloArrayDay2 {
    public static void main(String[] args) {
        int myRandom = (int) (Math.random() * 100);
        int[] a1 = new int[myRandom];
        fillMyLovelyArray(a1);
        //System.out.println(findAverage(a1));


    }

    public static void fillMyLovelyArray(int[] inputArray) {
        System.out.println("Массив длиной - " + inputArray.length);
        for (int element : inputArray) {
            element = (int) (Math.random() * 100);
            System.out.print(element + ", ");
        }
        int min = findMin(inputArray);
        int max = findMax(inputArray);
        int average = findAverage(inputArray);
        System.out.println("Среднее значение = " + average);
    }

    private static int findAverage(int[] inputArray) {
        int sum = 0;
        for (int element : inputArray) {
            sum += sum + element;
        }


        return sum / inputArray.length;
    }

    private static int findMin(int[] inputArray) {
        int min = inputArray[0];
        for (int j : inputArray) {
            if (min > j) {
                min = j;
            }

        }

        return min;
    }

    private static int findMax(int[] inputArray) {

        return 0;
    }

    public static void myArrayPrint(int[] arrayToPrint) {

        for (int i = 0; i < arrayToPrint.length; i++) {

        }
    }

}
