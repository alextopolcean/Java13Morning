package lesson22;

public class MzLovelzTernalOperator {
    public static void main(String[] args) {
        test1();
        test2();
    }

    public static void test1() {
        int a = 10;
        int b = 20;
        int c;
        if (a > b) {
            c = a;
        } else {
            c = b;
        }
        System.out.println("c из тернарного оператора = " + c);

    }

    public static void test2() {
        int a = 10;
        int b = 20;
        int c;
        c = (a > b) ? a : b;
        System.out.println("c из  оператора = " + c);
    }
}
