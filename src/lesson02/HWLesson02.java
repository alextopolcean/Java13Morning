package lesson02;

public class HWLesson02 {
    public static void main(String[] args) {
        chess();
        square();
        rectangle();
        cube();
    }


    /*   Найти количество зёрен на шахматной доске, если на первую клетку положить одно зёрнышко, на вторую клетку два
                зёрнышка, на третью в два раза больше, чем на предыдущей, то есть четыре и так далее.
    */
    public static void chess() {
        int a = 2;
        int b = 64;
        double c = Math.pow(a, b);
        System.out.println(c);
    }


    // Найти площадь и периметр квадрата
    public static void square() {
        int a = 3;
        int area = a * a;
        int perimeter = 4 * a;
        System.out.println("Площадь квадрата = " + area);
        System.out.println("Периметр квадрата = " + perimeter);
    }


    // Найти площадь и периметр прямоугольника
    public static void rectangle() {
        int a = 5;
        int b = 6;
        int area = a * b;
        int perimeter = 2 * (a + b);
        System.out.println("Площадь прямоугольника = " + area);
        System.out.println("Периметр прямоугольника = " + perimeter);
    }


    /* Найти площадь и периметр куба.
       Площадь куба — это сумма площади всех его сторон.
       Все стороны куба равны, поэтому, чтобы найти площадь куба,
       надо найти площадь одной из его сторон и умножить на 6.
       Чтобы найти периметр куба, нужно длину одного из его ребер умножить на 12.
    */
    public static void cube() {
        int s = 5;
        int area = 6 * s * s;
        int perimeter = 12 * s;
        System.out.println("Площадь куба = " + area);
        System.out.println("Периметр куба = " + perimeter);
    }

}
