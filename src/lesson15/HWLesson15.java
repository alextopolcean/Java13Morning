package lesson15;

public class HWLesson15 {


    public static void main(String[] args) {
        System.out.println("*************************");
        containsCharSequence();
        System.out.println("*************************");
        stringEndsWith();
        System.out.println("*************************");
        equalObjectAnObjekt();
        System.out.println("*************************");
        equalsIgnoreCase();
        System.out.println("*************************");
        isEmpty();
        System.out.println("*************************");
        length();
        System.out.println("*************************");
        replace();
        System.out.println("*************************");
        startsWith();
        System.out.println("*************************");
        substring();
        System.out.println("*************************");
        toLowerAndUpperCase();
        System.out.println("*************************");
        trim();
        System.out.println("*************************");


    }

    /*
   Метод contains () - это метод Java, позволяющий проверить, содержит ли String другую подстроку или нет.
   Возвращает логическое значение, поэтому его можно использовать непосредственно внутри операторов if.
    */
    public static void containsCharSequence() {

        //System.out.println(s.contains("Я учусь в Tel-Ran"));
        String s1 = "Я учусь в Tel-Ran";
        System.out.println("Я учусь в Tel-Ran => contains 'учусь' => " + s1.contains("учусь"));
        System.out.println("Я учусь в Tel-Ran => contains 'Tel'   => " + s1.contains("Tel"));
        System.out.println("Я учусь в Tel-Ran => contains 'java'  => " + s1.contains("java"));
    }

    // endsWith(String suffix) - проверяет, заканчивается ли эта строка указанным окончанием.
    // suffix — окончание.

    public static void stringEndsWith() {
        String s = "Tel-Ran";
        System.out.println("в слове Tel-Ran окончание Tel => " + s.endsWith("Tel"));
        System.out.println("в слове Tel-Ran окончание Ran => " + s.endsWith("Ran"));
    }

    // Метод equals() проверяет, равны ли два объекта (например, две строки).

    public static void equalObjectAnObjekt() {
        String morning1 = "Guten Morgen!";
        String morning2 = "Guten Morgen!";
        String evening = "Guten Abend!";
        String night = "Gute Nacht!";
        System.out.println("Guten Morgen! = Guten Morgen! => " + morning1.equals(morning2));
        System.out.println("Guten Morgen! = Guten Abend!  => " + morning1.equals(evening));
        System.out.println("Guten Morgen! = Gute Nacht!   => " + morning2.equals(night));
    }

    // Этот метод сравнивает эту строку с другой строкой, игнорируя соображения регистра.
    // Две строки считаются равными без учета регистра, если они имеют одинаковую длину,
    // а соответствующие символы в двух строках равны без учета регистра.

    public static void equalsIgnoreCase() {
        String s1 = "Tel-Ran";
        String s2 = "tel-ran";
        String s3 = "TEL-RAN";
        String s4 = "Tel-Ran!";
        System.out.println("Tel-Ran = tel-ran  => " + s1.equalsIgnoreCase(s2));
        System.out.println("tel-ran = TEL-RAN  => " + s2.equalsIgnoreCase(s3));
        System.out.println("Tel-Ran = Tel-Ran! => " + s1.equalsIgnoreCase(s4));
    }

    /*
    Метод java string isEmpty () проверяет, является ли эта строка пустой или нет.
    Возвращает true, если длина строки равна 0, в противном случае - false.
    Другими словами, true возвращается, если строка пуста,
    в противном случае возвращается false.
     */

    public static void isEmpty() {
        String one = "";
        String two = "Alex";
        System.out.println("String one является пустой строкой => " + one.isEmpty());
        System.out.println("String two является пустой строкой => " + two.isEmpty());
    }

    // Этот метод возвращает длину этой строки.
    // Длина равна количеству 16-битных символов Юникода в строке.

    public static void length() {
        String s = "Международная технологическая школа IT TEL-RAN";
        System.out.println("В строке \"Международная технологическая школа IT TEL-RAN\" => " + s.length() + " символов");
    }


    // Метод replace() заменяет указанный символ (или подстроку) в строке на новый.

    public static void replace() {
        String s1 = "ABC//ABCD//ABCDE";
        String s2 = s1.replace("ABC", "O+");
        System.out.println("в \"ABC//ABCD//ABCDE\" мы ABC неняем на O+ => " + s2);
    }

    /*
    Метод beginWith () класса String используется для проверки префикса String.
    Он возвращает логическое значение true или false в зависимости от того,
    начинается ли данная строка с указанной буквы или слова.
     */

    public static void startsWith() {

        String s = "Tel-Ran";
        System.out.println("Tel-Ran начинается с Tel => " + s.startsWith("Tel"));
        System.out.println("Tel-Ran начинается с Ran => " + s.startsWith("Ran"));
    }

    /*
    Метод substring () возвращает новую строку, которая является подстрокой данной строки.
    Метод  substring ()  используется, чтобы получить подстроку данной строки
    на основе переданных индексов.
     */
    public static void substring() {
        String s = "Добро пожаловать в школу Tel-Ran!";
        System.out.println("Добро пожаловать в школу Tel-Ran! c 26 символа до конца => " + s.substring(25));
        System.out.println("Добро пожаловать в школу Tel-Ran! с  1  по  17  символ  => " + s.substring(0, 16));
    }

    // Метод toLowerCase () преобразует строку в строчные буквы.
    // Метод toUpperCase () преобразует строку в заглавные буквы.

    public static void toLowerAndUpperCase() {
        String s = "Добро пожаловать в школу Tel-Ran!";
        System.out.println("Добро пожаловать в школу Tel-Ran! => строчными буквами  => " + s.toLowerCase());
        System.out.println("Добро пожаловать в школу Tel-Ran! => заглавными буквами => " + s.toUpperCase());
    }

    // trim() - Этот метод возвращает копию строки, пропуская начальные и конечные пробелы.
    public static void trim() {
        String s = "   Добро пожаловать к нам в гости!   ";
        System.out.println("Строка с пробелами    => " + s);
        System.out.println(".trim удаляет пробелы => " + s.trim());
    }
}






