package lesson30;

public class lesson28 {
    public static void main(String[] args) {
        multiplicationsTable(10);

    }

    private static void multiplicationsTable(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i * j < 10) {
                    System.out.print("" + i * j);
                }
                System.out.print("  " + i * j);

            }
            System.out.println();

        }
    }

    public static void nestedLoops() {
        for (int i = 0; i < 5; i++) {
            System.out.printf("Внешний круг");
            for (int j = 0; j < 6; j++) {
                System.out.printf("Пирожки" + j);

            }

        }
    }
}
