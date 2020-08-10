package lesson06;

public class HWLesson06_07 {
    public static void main(String[] args) {

        split();
        alcoholPermission(12);
        alcoholPermission(17);
        alcoholPermission(18);
        alcoholPermission(25);
        alcoholPermission(60);

        split();

        season(3);
        season(5);
        season(8);
        season(10);
        season(15);
        split();
    }

    // Напишите программу действий кассира магазина, если у него пытаются
    // купить алкоголь следующие 5 покупателей:
    // 10 лет, 17 лет, 18 лет, 20 лет и 30 лет.

    public static void alcoholPermission(int age) {
        switch (age) {

            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                System.out.println("Вам не положено!Вам ещё нет 16 лет!");
                break;
            case 16:
            case 17:
                System.out.println("Вам разрешен только слабый алкоголь! Вам ещё нет 18 лет!");
                break;
            default:
                System.out.println("Спасибо за покупку! Приходите к нам ещё");

        }

    }

    // Напишите программу, которая определяет сезон года.
    // На вход приходят месяцы
    // Месяца указаны int переменными.

    public static void season(int month) {

        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");


        }
    }

    public static void split() {
        System.out.println("----------------------");
    }


}

