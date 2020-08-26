package lesson48;

public class ClassWorkStringExercises02 {
    public static void main(String[] args) {


        System.out.println(zipZap("zipXzap"));// → "zpXzp"
        System.out.println(zipZap("zopzop"));// → "zpzp"
        System.out.println(zipZap("zzzopzop"));// → "zzzpzp"
        System.out.println("...........................");
        System.out.println(wordEnds("abcXY123XYijk", "XY"));// → "c13i"
        System.out.println(wordEnds("XY123XY", "XY"));// → "13"
        System.out.println(wordEnds("XY1XY", "XY"));// → "11"


    }
    // Look for patterns like “zip” and “zap” in the string – length-3, starting with ‘z’ and ending with ‘p’.
    // Return a string where for all such words, the middle letter is gone, so “zipXzap” yields “zpXzp”.

    private static String zipZap(String str) {
        String z = "";
        String p = "";
        String temp = "";
        for (int i = 0; i < str.length() - 2; i++) {
            temp = str.substring(i, i + 3);
            if (temp.charAt(0) == 'z' && temp.charAt(2) == 'p') {
                z = str.substring(0, i + 1);
                p = str.substring(i + 2);
                str = z + p;
            }
        }
        return str;
    }

    // Given a string and a non-empty word string, return a string made of each char just before and just after every appearance of the word in the string.
    // Ignore cases where there is no char before or after the word, and a char may be included twice if it is between two words.
    // Для данной строки и непустой строки слова вернуть строку, состоящую из каждого символа, непосредственно перед и сразу после каждого появления слова в строке.
    // Игнорируйте случаи, когда перед словом или после слова нет символа, а символ может быть включается дважды, если находится между двумя словами.

    public static String wordEnds(String str, String strChar) {
        String result = "";
        int start = str.length();
        int end = strChar.length();
        for (int i = 0; i < start - end + 1; i++) {
            String temp = str.substring(i, i + end);
            if (i > 0 && temp.equals(strChar)) {
                result += str.substring(i - 1, i);
            }
            if (i < start - end && temp.equals(strChar)) {
                result += str.substring(i + end, i );
            }
        }


        return result;
    }
}