package lesson14;

public class HW14 {

    public static void main(String[] args) {

        System.out.println("*************************");
        review();
        System.out.println("*************************");
        review2();
        System.out.println("*************************");
        review3();
        System.out.println("*************************");
        review4();
        System.out.println("*************************");
        review5();
        System.out.println("*************************");
        review6();
        System.out.println("*************************");
        review7();
        System.out.println("*************************");
        reviev8();
        System.out.println("*************************");


    } // Преобразовать из String в int

    public static void review() {
        String number = "101";
        int result = Integer.parseInt((number));
        System.out.println("Результат преобразования = " + result);

    } // Преобразовать из String  в double

    public static void review2() {
        double pi = 3.14;
        String myPi = String.valueOf(pi);
        double newDigit = Double.parseDouble(myPi);
        System.out.println("Результат преобразования String в double = " + newDigit);

    } // Преобразовать из String в Char

    public static void review3() {
        String name = "Andrej";
        char myChar = name.charAt(2);
        System.out.println("Третий символ из имени Андрей = " + myChar);
        System.out.println(0 + myChar); // выведет на экран 100 (d = 100 символ)
        int myMagicInt = myChar;
        char myMagicCharTest = (char) myMagicInt;
        System.out.println(myMagicCharTest);

    }

    public static void review4() {
        String hello = "Hello";
        String output = hello.substring(hello.length() - 1);
        System.out.println(output); // o
        char test = hello.charAt(hello.length() - 1);
        System.out.println(test); // o
    }

    // определяет место в таблице символов
    public static void review5() {
        String testString = "13-ая группа утро!";
        int result = testString.codePointAt(4); //  я = 1103
        int result2 = testString.codePointAt(6); //  г = 1103
        int result3 = testString.codePointAt(7); //  р = 1103
        int result4 = testString.codePointAt(8); //  у = 1103
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }

    // определяет место в таблице предыдущего символа
    public static void review6() {
        String str = "I Love Java";
        System.out.println(str.codePointBefore(1)); // индекс, который находится перед индексом 1, т.е. индекс 0 = "I"
    }

    // codePointCount (int beginIndex, int endIndex)
    public static void review7() {
        String str = "Мы учимся в школе Телран онлайн";
        int cpc = str.codePointCount(3, 10);
        System.out.println(cpc);

    }

    public static void reviev8() {
        String str1 = "Строка для теста";
        String str2 = "Строка для теста";
        String str3 = "Другая строка для теста";
    }

    public static void review9() {
        String str1 = "Строка для теста";
        String str2 = "сТрОкА дЛя ТеСтА";
        String str3 = "Другая строка для теста";

    }

  

}
