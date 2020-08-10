package lesson04;

public class HWLesson04 {
    public static void main(String[] args) {
        myChar();
        myString();
        System.out.println(myLovelyString());

    }

    /*
    Найти в интернете таблицы для типа данных char. Проверить, что они действительно соответствуют тому, что
    выводит Java на экран. Найти "смешные" символы, символ стандартного смайлика, найти символ телефона,
    параграфа, копирайта(C), торговой марки(тм), рубля, евро, доллара, знаков зодиака, шахмат, червы.
     */
    public static void myChar() {
        char smiley = '\u263A';
        System.out.println("Cимвол smiley     => " + smiley);
        char soundRecordingCopyright = '\u2117';
        char ohm = '\u2126';
        char bitcoin = '\u20BF';
        char rubel = '\u20bd';
        char euro = '\u20AC';
        char registered = '\u00AE';
        char plusMinus = '\u00B1';
        char at = '\u0040';
        char dollar = '\u0024';
        char ampersand = '\u0026';

        System.out.println("Символы валют     => " + dollar + " " + euro + " " + rubel);
        System.out.println("Прочие символы    => " + soundRecordingCopyright + " " + ampersand + "  " + ohm
                + "  " + bitcoin + "  " + plusMinus + "  " + registered);

        char two = '\u0032';
        char null_0 = '\u0030';
        char g = '\u0413';
        char o = '\u041E';
        char d = '\u0414';

        System.out.println("Char (какой год?) => " + two + null_0 + two + null_0 + " " + g + o + d);
    }

    public static void myString() {
        String forname;
        String surmane;


        forname = " Alex ";
        surmane = " Top ";
        int age = 33;
        String beruf = " IT Spezialist";

        System.out.println(forname + surmane + age + beruf);


    }

    public static String myLovelyString() {
        String input1 = "Вход разрешён";
        String input2 = "воспрещён";
        String input3 = "Осторожно, ";

        int clientMagicnumber = 8;
        int myInputLenghth = input1.length();
        String myNewInput1 = input1.substring(0, 1).toLowerCase() + input1.substring(1, myInputLenghth - 8);
        return input3 + myNewInput1 + input2;

    }
}


