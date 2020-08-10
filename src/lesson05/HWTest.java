package lesson05;

public class HWTest {
    public static void main(String[] args) {
        split();

        double testRadius2 = 15;
        double testRadius = 10;
        double clientSquare = HWLesson05.findSquareCircle(10);
        double client2Square = HWLesson05.findSquareCircle(testRadius2);
        System.out.println("Площадь круга первого клиента = " + clientSquare);
        System.out.println("Площадь круга второго клиента = " + client2Square);
        split();


        double clientCircumference = HWLesson05.finfCircumference(testRadius);
        System.out.println("Длина окружности первого клиента = " + clientCircumference);
        double clientCircumference2 = HWLesson05.finfCircumference(testRadius2);
        System.out.println("Длина окружности второго клиента = " + clientCircumference2);
        split();

        double amount1 = 10;
        System.out.println("10€ в долларах = " + HWLesson05.currentyConverterEurtoDollar(amount1));
        double amount2 = 500;
        System.out.println("500€ в долларах = " + HWLesson05.currentyConverterEurtoDollar(amount2));
        split();

        System.out.println("10 долларов в € = " + HWLesson05.currentyConverterDollarToEuro(amount1));
        System.out.println("500 долларов в € = " + HWLesson05.currentyConverterDollarToEuro(amount2));
        split();

        System.out.println("Соотношение площадей Белоруссии и Украины = " + HWLesson05.belarusToUkraine());
        System.out.println("Соотношение площадей Москвы и Берлина = " + HWLesson05.findSquareRelation(2511, 891));
        split();

        System.out.println(HWLesson05.bankPercent(7, 3.5, 1000));
        split();

    }

    // Сделаем медот для отделения экрана
    public static void split() {
        System.out.println("----------------------");


    }


}
