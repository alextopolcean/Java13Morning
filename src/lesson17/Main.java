package lesson17;

public class Main {
    public static void main(String[] args) {
        System.out.println("**********************");
        mySlipFor();
        System.out.println("**********************");
        mySlipWhile();
        System.out.println("**********************");
        mySlipDoWhile();
        System.out.println("**********************");

    }

    public static void mySlipFor() {
        for (int i = 0; i < 20; i++) {
            System.out.println(i);

        }
    }

    public static void mySlipWhile() {
        int i = 0;
        while (i < 20) {
            System.out.println(i);
            i++;
        }
    }

    public static void mySlipDoWhile() {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 20);

    }
}
