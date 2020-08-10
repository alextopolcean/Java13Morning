package lesson05;

public class HWLesson05 {

    // Написать программу для вычисления площади круга.
    public static double findSquareCircle(double radius) {
        final double PI = Math.PI;

        return PI * radius * radius;
    }

    // Найти длину окружности
    public static double finfCircumference(double radius) {
        final double Pi = Math.PI;

        return 2 * Pi * radius;

    }

    //Написать формулу вычисления стоимости Евро, если курс Евро к Доллару 1,1
    public static double currentyConverterEurtoDollar(double euro) {
        double rate = 1.1;
        return euro * 1.1;
    }

    //Написать формулу вычисления стоимости Доллара, если курс Евро к Доллару 1,1
    public static double currentyConverterDollarToEuro(double euro) {

        return euro / 1.1;
    }

    // Найти соотношение площади Беларуси к площади Украины
    public static double belarusToUkraine() {
        double belarus = 207595;
        double ukraine = 603628;
        return belarus / ukraine;
    }

    //Найти, во сколько раз площадь Москвы больше площади Берлина.
    public static double findSquareRelation(double moskva, double berlin) {
        return moskva / berlin;
    }
    // Если клиент положил в банк 1000€ под 3,5%, какая сумма будет его ждать через семь лет

    public static double bankPercent(int year, double percent, double amount) {

        return amount + amount * year * percent / 100;
    }
}
