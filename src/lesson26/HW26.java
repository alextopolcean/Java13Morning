package lesson26;

public class
HW26 {
    public static void main(String[] args) {
        System.out.println(startOut("ab*cd"));
        System.out.println(startOut("ab**cd"));
        System.out.println(startOut("sm*eilly"));
        System.out.println(startOut("sme**lly"));
        System.out.println("..........................");
        /*System.out.println(countHi("abc hi ho"));// → 1
        System.out.println(countHi("ABChi hi"));// → 2
        System.out.println(countHi("hihi"));// → 2

         */

    }

    public static String startOut(String str) {
        String output = "";
        char star = '*';
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == star && str.charAt(i - 1) != star) {
                output = str.substring(0, i - 1) + str.substring(i + 2);

            } else if (str.charAt(i) == star && str.charAt(i - 1) == star) {
                output = str.substring(0, i - 2) + str.substring(i + 2);

            }
        }

        return output;
    }




    /*public static int countHi (String input){
        String hi = "hi";
        int countMyHi = 0;
        for (int i = 0; i <input.length() ; i++) {
            if (input.substring(i,i+2).equals(hi)){
                countMyHi++;
            }

        }

        return countMyHi;
    }

     */
}
