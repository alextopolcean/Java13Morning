package lesson24;

public class Exsercises {
    public static void main(String[] args) {
        System.out.println(nearTen(12)); // → true
        System.out.println(nearTen(17)); // → false
        System.out.println(nearTen(19)); // → true
        System.out.println("--------------------");
        System.out.println(teaParty(6, 8)); // 1
        System.out.println(teaParty(3, 8)); // 0
        System.out.println(teaParty(20, 6)); // 2

    }


    private static boolean nearTen(int num) {

        return num % 10 <= 2 || num % 10 >= 8;
    }

    /*
    We are having a party with amounts of tea and candy. Return the int outcome of the party encoded as 0=bad, 1=good, or
2=great. A party is good (1) if both tea and candy are at least 5. However, if either tea or candy is at least double the
amount of the other one, the party is great (2). However, in all cases, if either tea or candy is less than 5,
the party is always bad (0).

     */
    private static int teaParty(int tee, int candy) {
        if (tee < 5 || candy < 5) {
            return 0;
       //} else if (tee >= 5 && candy >= 5) {
         //  return 1;
        } else if ((tee * 2 <= candy) || (candy * 2 <= tee)) {
            return 2;
        }

        return 1;

    }
    
}
