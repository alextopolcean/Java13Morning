package lesson12;

public class HelloFor {
    public static void main(String[] args) {
        helloFor();
        System.out.println("--------------------");
        myLittleFor();

    }

    public static void helloFor() {
        for (int i = 100; i >= -10; i -= 5) {
            System.out.println("И = " + i);

        }
    }

    public static void myLittleFor() {
        int a = 0;
        for (int i = 0; i < 10; i++) {
            a++;
            System.out.println(a);
            System.out.println("--------------------");


        }
        System.out.println("******************************");
        System.out.println(a);
        System.out.println("******************************");

        for (int i = 0; i < 20; i++) {
            a++;
            System.out.println(a);
            System.out.println("--------------------");

        }
        System.out.println("******************************");
        System.out.println(a);
        System.out.println("******************************");

    }

}
