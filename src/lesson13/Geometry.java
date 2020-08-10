package lesson13;

public class Geometry {
    public static void main(String[] args) {
        floydsTriangle(5, 15);
        johnDo();

    }

    public static void floydsTriangle(int line, int number) {

        int star = 1;
        String output = "";
        for (int i = 0; i < line; i++) {
            //System.out.println(output += star);

            output = output + star;
            System.out.println(output);
            star += 1;

        }
    }

    public static void johnDo() {
        int rowIndex = 1;
        for (int x = 1; x <= 36; x++) {
            for (int y = x; y <=  36; y++) {
                for (int z = y; z <= 36; z++) {
                    if (x * y * z == 36) {
                        System.out.println(rowIndex + ") " + "x = " + x + ", y = " + y + ", z = " + z);
                        rowIndex++;
                    }

                }

            }

        }
    }
}
