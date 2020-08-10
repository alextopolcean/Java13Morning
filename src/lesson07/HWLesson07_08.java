package lesson07;

public class HWLesson07_08 {
    public static void main(String[] args) {
        split();
        policeSpeedControl(49);
        policeSpeedControl(50);
        policeSpeedControl(51);
        policeSpeedControl(65);
        policeSpeedControl(66);
        policeSpeedControl(67);
        policeSpeedControl(99);
        policeSpeedControl(100);
        policeSpeedControl(129);
        policeSpeedControl(130);
        policeSpeedControl(131);
        split();
        leapYear(400);
        split();
        leapYear(500);
        split();
        leapYear(2000);
        split();
        leapYear(2012);
        split();
        leapYear(1900);
        split();


    }

    /*
        Напишите программу действий для сотрудника дорожной полиции, который остановил машину:
        при езде до 50 км/час нарушений нет;
        за езду от 50 км/час до 65 км/час — устное порицание и лекция на 5 минут;
        за превышение скорости от 16 км/час — 40 евро штрафа;
        за езду от 100 км/час до 130 км/час — штраф 500 евро;
        и за езду свыше 130 км/час — штраф в 1000 евро, конфискация прав на 3 года и конфискация транспортного
        средства.

     */
    public static void policeSpeedControl(int speed) {

        if (speed < 50) {
            System.out.println("Нарушений нет. " + "Вы ехали со скоростью " + speed + " км/ч");
        } else if (speed < 66) {
            System.out.println("Устное порицание и лекция на 5 минут. " + "Вы ехали со скоростью " + speed + " км/ч");
        } else if (speed < 100) {
            System.out.println("Штраф 40 евро. " + "Вы ехали со скоростью " + speed + " км/ч");
        } else if (speed < 130 + 1) {
            System.out.println("Штраф 500 евро. " + "Вы ехали со скоростью " + speed + " км/ч");
        } else {
            System.out.println("Конфискация прав на 3 года и конфискация транспортного средства." + " Вы ехали со скоростью " + speed + " км/ч");
        }

    }

    /* Напишите программу , которая находит високосный год!
    Для этого берём  Данные из Википедии!
    Год, номер которого кратен 400, — високосный;
    Остальные годы, номер которых кратен 100, — невисокосные (например, го­ды 1700, 1800, 1900, 2100);
    Остальные годы, номер которых кратен 4, — високосные[

     */
    public static void leapYear(int year) {
        System.out.println(("Эта программа высчитывает високосный год."));


        boolean isLeapYear = ((year % 4 == 0) ^ (year % 100 != 0) || (year % 400 == 0));

        if (isLeapYear) {
            System.out.println(year + " Год -  это високосный год.");
        } else
            System.out.println((year + " Год -  это невисокосный год."));
    }


    public static void split() {
        System.out.println("-----------------------");
    }

}


