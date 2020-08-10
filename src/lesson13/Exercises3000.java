package lesson13;

public class Exercises3000 {
    public static void main(String[] args) {
        finfMagicNumber();


    }

    public static void finfMagicNumber() {
        for (int i = 0; i < 3000; i++) {
            if (i % 32 == 30 && i % 58 == 44) {
                System.out.println(i);
            }

        }
    }
}
