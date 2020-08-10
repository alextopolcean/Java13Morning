package lesson09;

public class Work0902 {
    public static void main(String[] args) {
        split();
        System.out.println(nearHundert(93));
        System.out.println(nearHundert(90));
        System.out.println(nearHundert(89));
        System.out.println(getPercent(1000, 7));
        split();
        System.out.println(findElectricityPrice(500));
        System.out.println(findElectricityPrice(150));
        split();

    }

    public static boolean nearHundert(int digits) {
        int range = 10;

        if (Math.abs(digits - 100) < range || Math.abs(digits - 200) < range) {


        }
        return false;
    }

    public static double getPercent(double amount, double interest) {

        return amount / 100 * interest;
    }

    public static double findElectricityPrice(double kWh) {
        double basicKWhPrice = 0.2;
        double basicPrice = 30.0;
        double basicKWh = 100.0;

        double resultPrice;
        if (kWh > 100) {
            kWh = kWh - basicKWh;
            resultPrice = kWh * basicKWhPrice + basicPrice;


        } else {

            resultPrice = basicPrice;
        }

        return resultPrice;

    }
    public static void split (){
        System.out.println("-----------------------");
    }


}

