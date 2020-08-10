package lesson03;

public class HWLesson03 {
    public static void main(String[] args) {
        findSquareRectangle();
        euroExchange();
        ratio();

    }

    //  Написать программу для вычисления площади круга
    //  Площадь круга = Pi * R² (Pi~3.1415; r-радиус, d-диаметр, s-площадь)

    public static void findSquareRectangle() {
        double r = 7.5;
        double d = 2 * r;
        double s = Math.PI * r * r; // Pi * R²
        System.out.println("Площадь круга = " + s);
        System.out.println("Диаметр круга = " + d);


        // Найти длину окружности
        // Длину окружности можно вычислить по двум формулам: C = 2πr или C = πd,
        // где π – число «пи» (математическая константа, приблизительно равная 3,14),
        // r – радиус окружности, d – диаметр окружности.

        double c = 2 * Math.PI * r;  // Первая формула вычисления длины окружности
        double c2 = Math.PI * d;     // Вторая формула вычисления длины окружности
        System.out.println("Длина окружности = " + c);
        System.out.println("Длина окружности = " + c2);

    }
    // Написать формулу вычисления стоимости Евро, если курс Евро к Доллару 1,1

    public static void euroExchange() {
        double eur = 1.1;
        double usd = 1.0;
        double eurToUsd = eur / usd;
        double usdToEur = usd / eur;
        System.out.println(100 * eurToUsd); // меняем 100 Евро на доллары
        System.out.println(100 * usdToEur); // меняем 100 Евро на доллары
        System.out.println(30 * eurToUsd); // меняем 30 Евро на доллары
        System.out.println(30 * usdToEur); // меняем 30 долларов на евро

    }

    // Найти соотношение площади Беларуси к площади Украины.
    // Найти, во сколько раз площадь Москвы больше площади Берлина.

    public static void ratio() {
        double bel = 207600;  // площадь Беларуси
        double ukr = 603629; // площадь Украины
        double mos = 2511;    // площадь Москвы
        double ber = 892;     // площадь Берлина
        double ratioBelUkr = bel/ukr;
        double ratioMosBer = mos/ber;
        System.out.println(ratioBelUkr);
        System.out.println(ratioMosBer);

    }

}
