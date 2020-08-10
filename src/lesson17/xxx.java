package lesson17;

public class xxx {
    public static void main(String[] args) {
        myMetod(10);
        xxx();
        add(5,6);
    }

    private static void myMetod(int b) {
        for (int i = 0; i < b; i += 2) {
            System.out.println(i);

        }
    }

    public static void xxx() {
        int x = 2;
        int y = 3;
        int z = 4;
        if (x == 2 && y <= 3) System.out.println("111");
        else System.out.println("2222");
    }

    public static void add(int a, int b) {
        System.out.println(a+b);
       // return 5 + 6;

    }
}
