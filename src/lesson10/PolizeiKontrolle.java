package lesson10;

public class PolizeiKontrolle {
    public static void main(String[] args) {
        split();
        System.out.println(sppedLimits(45));
        System.out.println(sppedLimits(50));
        System.out.println(sppedLimits(51));
        System.out.println(sppedLimits(65));
        System.out.println(sppedLimits(66));
        System.out.println(sppedLimits(150));
        split();
        System.out.println(speedLimitsTwo(55));
        System.out.println(speedLimitsTwo(65));
        System.out.println(speedLimitsTwo(85));
        System.out.println(speedLimitsTwo(120));
        System.out.println(speedLimitsTwo(135));
        System.out.println(speedLimitsTwo(220));
        split();


    }

    public static String sppedLimits(int speed) {
        if (speed <= 50) {
            return "Нарушений нет!";

        } else if (speed < 65) {
            return "Устное порицание!";
        } else if (speed < 100) {
            return "Штраф 40€";

        } else if (speed <= 130) {
            return "Штраф 500€";
        } else {
            return "Штраф 1000€";
        }

    }

    public static void split() {
        System.out.println("----------------------------------");
    }

    public static String speedLimitsTwo(int speed) {

        String resuilt = "";

        if (speed <= 50) {
            resuilt = "Нарушений нет!!!";

        } else if (speed <= 65) {
            resuilt = "Устное порицание!!!";
        } else if (speed <= 100) {
            resuilt = "Штраф 40€ !!!";

        } else if (speed <= 130) {

            resuilt = "Штраф 500€ !!!";

        } else {
            resuilt = "Штраф 1000€ и лешение прав на месяц !!!";

        }


        return resuilt;

    }

}
