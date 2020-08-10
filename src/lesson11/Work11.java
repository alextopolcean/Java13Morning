package lesson11;

public class Work11 {

    public static void main(String[] args) {
        System.out.println(close10(3,5));
        System.out.println("---------------");
        System.out.println(monkeyTrouble(true, true));
        System.out.println(monkeyTrouble(false, false));
        System.out.println(monkeyTrouble(true, false));


        //System.out.println(mixStart("mix snacks"));
       // System.out.println(mixStart("pix snacks"));
        // System.out.println(mixStart("piz snacks"));
    }

    /*
    public static boolean mixStart(){
        String etalon = "ix";
      return str.substring (1,3).equals(etalon);
  }

     */
    public static int close10(int one, int two) {
        int difference1 = Math.abs(one - 10);
        int difference2 = Math.abs(two - 10);


        if (difference1 < difference2) {
            return one;
        } else if (difference1 > difference2) {
            return two;

        } else return two;


    }
    public static boolean monkeyTrouble (boolean aSmile, boolean bSmile){
        return aSmile == bSmile;
    }

}
