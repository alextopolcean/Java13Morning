package lesson10;

public class Tabelle {
    public static void main(String[] args) {
       multiplicationTable();
        //multiplicationTable2();

    }

    public static void multiplicationTable() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("");
            for (int j = 1; j <= 10; j++) {
                //System.out.println("");
                System.out.printf("%5d", i * j );

            }

            System.out.println();
        }


    }

    public static void multiplicationTable2() {
        for (int i = 0; i < 10; i++) {
            System.out.println("");
            for (int j = 0; j < 10; j++) {
                System.out.printf("%5d", (i + 1) * (j + 1));
            }
            System.out.println();
        }
    }
}
