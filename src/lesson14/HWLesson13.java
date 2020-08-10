package lesson14;

public class HWLesson13 {

    public static void main(String[] args) {

        System.out.println("**************************");
        minCat("Hello", "Hi"); // loHi
        minCat("Hello", "java"); // ellojava
        minCat("java", "Hello"); // javaello
        minCat("Aaa", "Bbb");
        System.out.println("**************************");
        //doubleChar("The");
        //doubleChar("AAbb");
        //doubleChar("Hi-There");
        System.out.println(doubleChar("The"));
        System.out.println(doubleChar("AAbb"));
        System.out.println(doubleChar("Hi-There"));
        System.out.println("**************************");
        System.out.println(loseSum(1, 2, 3)); // 6
        System.out.println(loseSum(3, 2, 3)); // 2
        System.out.println(loseSum(3, 3, 3)); // 0
        System.out.println(loseSum(5, 5, 5)); // 0
        System.out.println(loseSum(5, 7, 5)); // 7
        System.out.println("**************************");
        System.out.println(metodReturn(123)); // 123 -> 6 (1+2+3)
        System.out.println(metodReturn(768)); // 768 -> 21 (7+6+8)
        System.out.println("**************************");


    }

    /*
   Получив две строки, сложите их вместе (называемые «конкатенация») и верните результат.
   Однако, если строки имеют разную длину, опустите символы из более длинной строки, чтобы она была такой же длины,
   что и более короткая строка. Так что "Hello" и "Hi" дают "loHi". Строки могут быть любой длины.
    */

    public static void minCat(String one, String two) {

        int oneLength = one.length();
        int twoLength = two.length();

        if (oneLength > twoLength) {
            System.out.println(one.substring(oneLength - two.length()) + two);
        } else System.out.println(one + two.substring(two.length() - one.length()));

    }

    // Если задана строка, вернуть строку, где для каждого символа в оригинале есть два символа.

    public static String doubleChar(String input) {
        String doubledOutput = "";
        int inputLength = input.length();
        for (int i = 0; i < inputLength; i++) {
            String charOfString = input.substring(i, i + 1);
            doubledOutput = doubledOutput + charOfString + charOfString;


        }

        return doubledOutput;
    }


    // Если даны 3 значения типа int, a b c, вернуть их сумму.
    // Однако, если одно из значений совпадает с другим из значений, оно не засчитывается в сумму.
    // loneSum (1, 2, 3) → 6
    // loneSum (3, 2, 3) → 2
    // loneSum (3, 3, 3) → 0

    public static int loseSum(int a, int b, int c) {

        if (a == b && a != c) {
            return c;
        } else if (a == c && a != b) {
            return b;
        } else if (b == c && b != a) {
            return a;
        } else if (a == b) {
            return 0;

        }
        return a + b + c;
    }


    // Дано целое трехзначное число. Написать метод, который возвращает сумму разрядов этого числа, например:
    // 123 -> 6 (1+2+3)
    // 768 -> 21 (7+6+8)

    public static int metodReturn(int zahl) {
        int a = zahl / 100;
        int b = zahl / 10 % 10;
        int c = zahl % 100 % 10;
        if (zahl >= 100 && zahl <= 999) {
            return a + b + c;
        }

        return 0;
    }

}



