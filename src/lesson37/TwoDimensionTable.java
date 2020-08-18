package lesson37;

public class TwoDimensionTable {
    public static void main(String[] args) {
        int[][] array = new int[5][6];
        createArray(array);
        printArray(createArray(array));
        Pifagortable.printTwoDimensionArray(array);
    }

    private static void printArray(int[][] input) {
        for (int i = 0; i < input[2].length; i++) {
            System.out.print(input[2][i] + "  ");

        }
        System.out.println("--------------------------");

    }

    // Создайте массив размерностью 5 на 6 и заполните его случайными числами (в диапазоне от 0 до 99 ).
    // Выведите на консоль третью строку
    private static int[][] createArray(int[][] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                myArray[i][j] = (int) (Math.random() * 100);

            }

        }
        return myArray;
    }
}
