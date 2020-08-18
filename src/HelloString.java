public class HelloString {
    public static void main(String[] args) {
        System.out.println(xyzMiddle("AAxyzBB"));// → true
        System.out.println(xyzMiddle("AxyzBB")); // → true
        System.out.println(xyzMiddle("AxyzBBB")); // → false
        int findChar = myIndexOf('z', "AAxyzBB");
        System.out.println(findChar);

    }

    private static int myIndexOf(char inputChar, String input) {
        int index = -1;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == inputChar) {
                index = i;
            }
        }
        return index;


    }
    // Given a string, does “xyz” appear in the middle of the string? To define middle,
    // we’ll say that the number of chars to the left and right of the “xyz” must differ by at most one.
    // This problem is harder than it looks.
    // Для данной строки появляется ли «xyz» в середине строки? Чтобы определить середину,
    // скажем, что количество символов слева и справа от «xyz» должно отличаться не более чем на один.
    // Эта проблема сложнее, чем кажется.

    public static boolean xyzMiddle(String input) {
        int startRange = input.indexOf('x');
        int endRange = input.length() - input.indexOf('z') - 1;
        //System.out.println(startRange);
        //System.out.println(endRange);
        return Math.abs(endRange - startRange) <= 1;
    }
}
