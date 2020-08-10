package lesson04;

public class MyLovelyDigits {
    public static void main(String[] args) {
        myDouble();
        //myLovelyRound(5.5252525);
        //myLovelyRound(6.66666666);
    }

    public static void myDouble() {
        double myConst = Math.PI;
        //System.out.println("MyConst PI from Bibliothek = " + myConst);
        double myNewPi = myLovelyRound(myConst);
        System.out.println("myNewPi округлённое значение = " + myNewPi);
        double anotherVariable = 9.856675;
        System.out.println("Округлённое значение из 9856675 = " + myLovelyRound(anotherVariable));
        //double
        double newNewVariable = 5.65656565785875454845154;
        System.out.println("Показать моё новое новое округлённое число = " + myLovelyRound(newNewVariable));
    }











    public static double myLovelyRound(double digitsToRound) {
        double temp0 = digitsToRound * 100;
        //System.out.println("Шаг 1 => " + temp0);

        int temp1 = (int) temp0;
        //System.out.println("Шаг 2 => " + temp1);

        temp0 = temp1;
        //System.out.println("Шаг 3 => " + temp0);

        temp0 = temp0 / 100;
        //System.out.println("Шаг 4 => " + temp0); //

        return temp0;

    }
}

