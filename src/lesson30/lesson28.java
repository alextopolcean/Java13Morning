package lesson30;

public class lesson28 {
    public static void main(String[] args) {
        multiplicationsTable(10);

    }

    private static void multiplicationsTable(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                //System.out.printf("%3d ", i * j);
                System.out.print(formatTable(i,j));
            }
            System.out.println();

        }


    }

    public static String formatTable(int i, int j) {
        String result = "" + i * j;
        if (i * j < 10) {
            result = "   " + i * j;
        }else if(i*j<100){
            result = "  " + i * j;
        }else if (i*j <1000){
            result = " " + i * j;
        }
        return result;
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
