package lesson24;

public class HW24 {
    public static void main(String[] args) {
        System.out.println(blueTicket(9, 1, 0));// → 10
        System.out.println(blueTicket(9, 2, 0));// → 0
        System.out.println(blueTicket(6, 1, 4));// → 10
        System.out.println(blueTicket(20, 5, 15));// → 5
        System.out.println("......................");
        System.out.println(dateFashion(5, 10));// → 2
        System.out.println(dateFashion(5, 2));// → 0
        System.out.println(dateFashion(5, 5));// → 1
        System.out.println("......................");
        System.out.println(sortaSum(3, 4));// → 7
        System.out.println(sortaSum(9, 4));// → 20
        System.out.println(sortaSum(10, 11));// → 21

    }


    /*
    You have a blue lottery ticket, with ints a, b, and c on it. This makes three pairs, which we'll call ab, bc, and ac.
    Consider the sum of the numbers in each pair. If any pair sums to exactly 10, the result is 10.
    Otherwise if the ab sum is exactly 10 more than either bc or ac sums, the result is 5. Otherwise the result is 0.

     */
    private static int blueTicket(int a, int b, int c) {
        if (a + b == 10 || b + c == 10 || a + c == 10) {
            return 10;
        } else if (a + b + 10 == b + c || a + b + 10 == a + c) {
            return 5;
        }
        return 0;
    }

    /*
    You and your date are trying to get a table at a restaurant. The parameter "you" is the stylishness of your clothes,
    in the range 0..10, and "date" is the stylishness of your date's clothes. The result getting the table is encoded as
    an int value with 0=no, 1=maybe, 2=yes. If either of you is very stylish, 8 or more, then the result is 2 (yes).
    With the exception that if either of you has style of 2 or less, then the result is 0 (no). Otherwise the result is 1 (maybe).
     */

    private static int dateFashion(int you, int date) {
        if (you >= 8 || date >= 8) {
            return 2;
        } else if (you <= 2 || date <= 2) {
            return 0;
        }

        return 1;
    }

    /*
    Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive,
    are forbidden, so in that case just return
    */

    private static int sortaSum(int a, int b) {
        int s = a + b;
        if (s >= 10 && s <= 19) {
            return 20;
        }

        return s;
    }


}
