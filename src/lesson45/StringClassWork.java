package lesson45;

public class StringClassWork {
    public static void main(String[] args) {
        System.out.println(oneTwo("abc"));// → "bca"
        System.out.println(oneTwo("tca"));// → "cat"
        System.out.println(oneTwo("tcagdo"));// → "catdog"#
        System.out.println(oneTwo("telran!?"));// →eltanr

    }

    // Given a string, compute a new string by moving the first char to come after the next two chars, so "abc" yields "bca". Repeat
    //this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd".
    // Ignore any group of fewer than 3 chars at the end.

    private static String oneTwo(String str) {
        String output = "";
        for (int i = 0; i < str.length() - 2; i += 3) {
            if (str.length() - i < 3) {

            } else {
                output = output + str.substring(i + 1, i + 3) + str.substring(i, i + 1);
            }
        }


        return output;
    }
}
