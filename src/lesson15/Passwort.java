package lesson15;

public class Passwort {
    public static void main(String[] args) {
        System.out.println(genPass(20));
        System.out.println(Passwort.genPass(10));

    }

    public static String genPass(int length) {
        String pass = "";
        for (int i = 0; i < length; i++) {
            pass = pass + genChar();

        }


        return pass;
    }

    public static char genChar() {
        int myRandom = (int) (Math.random() * (90 - 65) + 1 + 65);

        return (char) myRandom;
    }


    public static String genString() {
        String result = "";
        double test = Math.random();
        boolean variable = false;
        if (test > 0.5){
            variable = true;
        }


        if (true) {
            result = String.valueOf(genChar()).toUpperCase();


        } else result = String.valueOf(genChar()).toLowerCase();

        return "";
    }
}
