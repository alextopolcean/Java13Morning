package lesson02;

public class HelloInteger {
    public static void main(String[] args) {
        goodMorningInteger();
        findeSquare();
    }

    public static void goodMorningInteger() {
        int a = 2; // создаём целочисленную переменную "a" и присваиваем ей значение 2
        int b = 3; // создаём целочисленную переменную "b" и присваиваем ей значение 3
        int c = a + b;
        System.out.println(c);
        System.out.println("Сложение двух чисел a + b = " + c);

        int jeans = 40;
        int pullover = 50;
        int baseCap = 15;
        int sum = jeans + pullover + baseCap;
        System.out.println("С Вас за все покупки " + (jeans + pullover + baseCap) + " €");
        System.out.println("С Вас за все покупки " + sum + " €");
    }
    public static void findeSquare(){
        int myFirstVariable = 5;
        int square = myFirstVariable * myFirstVariable;
        int perimetr = 4*myFirstVariable;
        System.out.println("Площадь квадрата = " + square);
        System.out.println("Периметр квадрата = " + perimetr);
    }
}
