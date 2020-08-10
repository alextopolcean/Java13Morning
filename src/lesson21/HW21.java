package lesson21;

import java.util.Scanner;

public class HW21 {

    public static void main(String[] args) {
        startGame();
    }

    public static void startGame() {
        int range = getMerange();
        int tryAndCry = getMyTries();
        int computerDigits = createDigit(range);
    }

    private static int getMyTries() {
        Scanner input = new Scanner(System.in);
        System.out.println("fdfdhggfdh");
        int userSecondNumber = input.nextInt();
        return userSecondNumber;
    }

    public static int createDigit(int range) {
        //return (int) (Math.random() * 100);
        return (int) (Math.random()* ((range-1) + 1) + 1);
    }
    public static int getMerange(){
        Scanner input = new Scanner(System.in);
        int userFirstNumber = input.nextInt();
        return userFirstNumber;
    }


}
