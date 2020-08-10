package lesson11;

public class ItsMyLife {
    public static void main(String[] args) {
        int weekDaysSven = 5;
        myLife(weekDaysSven);
        int weekDaysAlex = 6;
        myLife(weekDaysAlex);

    }

    public static void myLife(int amountWeekDay) {
        if (amountWeekDay <=7)
            for (int i = 1; i <= amountWeekDay; i++) {
                System.out.println("----------------------");
                System.out.println("Новый день " + i);
                System.out.println("Встаю в шесть утра " + i);
                System.out.println("Иду на завод к восьми " + i);
                System.out.println("Возвращаюсь домой " + i);
                System.out.println("Смотрю телевизор " + i);
                System.out.println("Курение с соседом " + i);
                System.out.println("Иду спать " + i);
                System.out.println("Мой день закончился " + i);
                System.out.println("----------------------");

            }


    }
}
