package lesson10;

public class HWDay10 {
    public static void main(String[] args) {
        split();
        System.out.println(startHi("hi there"));
        System.out.println(startHi("hi"));
        System.out.println(startHi("hello hi"));
        split();
        System.out.println(hasTeen(3, 5, 5));
        System.out.println(hasTeen(20, 19, 10));
        System.out.println(hasTeen(20, 20, 20));

    }

    //  Given a string, return true if the string starts with "hi" and false otherwise.

    public static boolean startHi(String word) {

        String beginning = word.substring(0, 2);
        switch (beginning) {
            case "hi":
                return true;
            default:
                return false;
        }

    }


    // We'll say that a number is "teen" if it is in the range 13..19 inclusive.
    // Given 3 int values, return true if 1 or more of them are teen.

    public static boolean hasTeen(int age1, int age2, int age3) {
        return age1 >= 13 && age1 <= 19 || age2 >= 13 && age2 <= 19 || age3 >= 13 && age3 <= 19;

        /*if (age1 >= 13 && age1 <= 19) {
            return true;
        } else if (age2 >= 13 && age2 <= 19) {
            return true;
        } else return age3 >= 13 && age3 <= 19;

         */

    }

    public static void split() {
        System.out.println("-----------------------");
    }


}
