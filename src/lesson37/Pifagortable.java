package lesson37;

public class Pifagortable {
    public static void main(String[] args) {
        printTwoDimensionArray(createMT(10));
    }

    public static void printTwoDimensionArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%4d",array[i][j]);

            }
            System.out.println();

        }
    }

    public static int[][] createMT(int length) {
        int[][] result = new int[length][length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = (i * j) + (i*j);
            }
        }

        return result;
    }
}
