package lesson36;

public class Calendar {
    public static void main(String[] args) {
        createMonth();
    }

    private static void createMonth() {
        int [][] monthCalendar;
        monthCalendar = new int[4][7];
        for (int i = 0; i < monthCalendar.length; i++) {
            for (int j = 0; j < monthCalendar[i].length; j++) {
                monthCalendar[i][j] = i*7+ j + 1;
                System.out.print(monthCalendar[i][j] + "  ");

            }
            System.out.println();
        }
        System.out.println("...................................");
        System.out.println("Компютер, распечатай мне элемент по индексу [][] - " + monthCalendar[2][3]);
        // по нашему условию, это 3 строчка [2] , 4 элемент [3] + 1
    }
}
