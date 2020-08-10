package lesson11;

public class Logik01 {
    public static void main(String[] args) {
        System.out.println(doorbell(true,true)); // false
        System.out.println(doorbell(false,false)); // false
        System.out.println(doorbell(true,false)); // true

    }
    public static boolean doorbell (boolean klingel, boolean klingel2){
        return klingel ^ klingel2;
    }

}
