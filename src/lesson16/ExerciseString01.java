package lesson16;

public class ExerciseString01 {
    public static void main(String[] args) {
        System.out.println(middleThree("Candy")); // and
        System.out.println(middleThree("and")); // and
        System.out.println(middleThree("solving")); // lvi
        System.out.println("*************************");
        System.out.println(lastChars("last", "chars")); // ls
        System.out.println(lastChars("yo", "java"));  // ya
        System.out.println(lastChars("hi", "")); // h@
        System.out.println("*************************");
        System.out.println(seeColor("redxxx")); // red
        System.out.println(seeColor("xxxred")); //
        System.out.println(seeColor("blueTimes")); // blue
        System.out.println("*************************");
        System.out.println(extraFront("Hello"));
        System.out.println(extraFront("ab"));
        System.out.println(extraFront("H"));
        System.out.println("*************************");
        System.out.println(withoutEnd("Hello"));
        System.out.println(withoutEnd("java"));
        System.out.println(withoutEnd("coding"));


    }

    //Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and".
    // The string length will be at least 3.

    public static String middleThree(String s) {
        int middle = s.length() / 2;

        return s.substring(middle - 1, middle + 2);
    }


    /*
    Given 2 strings, a and b, return a new string made of the first char of a and the last char of b,
    so "yo" and "java" yields "ya".
    If either string is length 0, use '@' for its missing char.
    lastChars("last", "chars") → "ls"
    lastChars("yo", "java") → "ya"
    lastChars("hi", "") → "h@"
     */
    public static String lastChars(String a, String b) {
        if (a.length() < 1) {
            a = "@";
        } else if (b.length() < 1) {
            b = "@";
        }

        return a.substring(0, 1) + b.substring(b.length() - 1);
    }


    /*
    Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.
    seeColor("redxx") → "red"
    seeColor("xxred") → ""
     seeColor("blueTimes") → "blue"
     */
    public static String seeColor(String s) {
        if (s.startsWith("red")) {
            return "red";
        } else if (s.startsWith("blue")) {
            return "blue";
        }
        return "";
    }

    public static String extraFront(String str) {
        if (str.length() < 2) {
            return str + str + str;
        } else {
            String newString = str.substring(0, 2);
            return newString + newString + newString;
        }


    }

    public static String withoutEnd(String s) {

        return s.substring(1, s.length() - 1);

    }

}
