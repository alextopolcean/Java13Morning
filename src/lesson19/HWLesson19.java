package lesson19;

public class HWLesson19 {
    public static void main(String[] args) {
        System.out.println(bobThereFor("abcbob")); // → true
        System.out.println(bobThereFor("b9b")); // → true
        System.out.println(bobThereFor("bac")); // → false
        System.out.println("..............................");
        System.out.println(bobThereWhile("abcbob")); // → true
        System.out.println(bobThereWhile("b9b")); // → true
        System.out.println(bobThereWhile("bac")); // → false
        System.out.println("..............................");
        System.out.println(bobThereDoWhile("abcbob")); // → true
        System.out.println(bobThereDoWhile("b9b")); // → true
        System.out.println(bobThereDoWhile("bac")); // → false


    }

    // Верните true, если данная строка содержит строку «bob», но где средний символ «o» может быть любым символом.
    // bobThere("abcbob") → true
    // bobThere("b9b") → true
    // bobThere("bac") → false

    public static boolean bobThereFor(String input) {

        char oneAndTree = 'b';

        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) == oneAndTree && input.charAt(i + 2) == oneAndTree) {
                return true;
            }

        }

        return false;
    }

    public static boolean bobThereWhile(String input) {
        char oneAndTree = 'b';
        int i = 0;

        while (i < input.length()) {
            if (input.charAt(i) == oneAndTree && input.charAt(i + 2) == oneAndTree)

                return true;
            i++;

        }

        return false;
    }

    public static boolean bobThereDoWhile(String input) {
        int i = 0;
        char oneAndTree = 'b';
        do {
            if (input.charAt(i) == oneAndTree && input.charAt(i + 2) == oneAndTree)

                return true;
            i++;


        } while (i < input.length());

        return false;
    }

}
