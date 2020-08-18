package lesson37;

public class OneMoreArrayExercise {
    public static void main(String[] args) {
        // создать двумерный массив и просуммировать все его элементы
        createArray();

        System.out.println(arraysSum(createArray()));
    }


    private static int[][] createArray() {
        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 100);

            }
        }
        return array;

    }

    private static int arraysSum(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum = sum + array[i][j];
            }
        }


        return sum;
    }
}
