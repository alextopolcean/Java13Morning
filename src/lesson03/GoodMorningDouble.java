package lesson03;

public class GoodMorningDouble {
    public static void main(String[] args) {
        // 3,5 => 3.5
        helloDouble();
        findSquareCircle();
        helloDoubleTwo();
    }

    public static void helloFloat() {
        float a, b, c, d, f, e, g;
        a = (float) 3.5;
        b = 5.4f;
        c = 10.11f;
        d = a + b + c;
        f = 10.0f;

    }

    public static void helloDouble() {
        double a, b, c;
        int d, e, f;

        d = 10; // у меня есть 10€
        f = 1000; // айфон стоит 1000€
        // сколько айфонов я могу купить?
        e = d / f;
        System.out.println("Количество купленных айфонов = " + e);

        a = 10.0;  // у меня 10,00€
        b = 20.0;  // 1 КГ черешни стоит 20,00€
        c = a / b; // Количество черешни, которую я куплю!
        System.out.println("Количество купленной черешни = " + c);

    }

    public static void findSquareCircle() {

        final double PI = 3.14;
        final double minTemp = 18;
        final double maxTemp = 26;
        double r = 5.5;
        double square = PI * r * r;
        double anotherSquare = Math.PI * Math.pow(r, 2);
        double anotherPI = Math.PI;
        System.out.println("Площадь найденная ручками = " + square);
        System.out.println("Площадь найденная Java = " + anotherSquare);

    }

    public static void helloDoubleTwo() {
        double a = 10;
        double b = 5;
        double c = Math.pow(b, a);
        System.out.println("Число 5 в степени 10 = " + c);
    }
}

