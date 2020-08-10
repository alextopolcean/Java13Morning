package lesson31;

public class NodNok {
    public static void main(String[] args) {
        System.out.println(greatestCommonDivisor(15, 60));
        System.out.println(greatestCommonDivisor(7, 3));
        System.out.println(greatestCommonDivisor(5, 15));
        System.out.println(greatestCommonDivisor(9, 12));
        System.out.println(greatestCommonDivisor(612, 680));
        System.out.println(greatestCommonDivisor(680, 612));
        System.out.println(".....................");
        System.out.println(leastСommonMultiple(60, 15));

    }

    // Найти НОД(наибольший общий делитель)
    public static int greatestCommonDivisor(int a, int b) {
        if (a == 0) {
            return b;
        } else if (b == 0) {
            return a;
        }


        return greatestCommonDivisor(b, a % b);
    }

    public static int leastСommonMultiple(int a, int b) {
        int nod = a * b / greatestCommonDivisor(a, b);


        return nod;
    }
}

