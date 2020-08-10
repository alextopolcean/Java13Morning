package lesson07;

public class Baikonur {
    public static void main(String[] args) {

        double shuttleSpeedOne = 5.2;
        double shuttleSpeedtwo = 15.1;

        shuttleStart(shuttleSpeedOne);
        split();
        shuttleStart(shuttleSpeedtwo);

    }
    public static void shuttleStart(double speed){
        final double SUPERCONSTANT_G = 10.0;

        if (speed<SUPERCONSTANT_G){
            System.out.println("Первоначальное значение недостаточно!");
            System.out.println("Ракета не может стартовать");
            System.out.println("Подготовить аварийные службы");
        }else {
            System.out.println("Ракета улетает в космос");
            System.out.println("555");
            System.out.println("Подготовить прагроммистов к награде!");
        }


    }
     public static void split(){
         System.out.println("--------------------------");
     }
}

