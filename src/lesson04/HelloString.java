package lesson04;

public class HelloString {
    public static void main(String[] args) {
        gutenTagString();
        myLovelyCharAndString();
    }

    private static void gutenTagString() {
        String firstName = "Alex";
        String lastName = "Top";
        char copyright = '\u00A9';
        int age = 33;
        System.out.println(firstName + " " + lastName + " " + age + " " + copyright);
        String studentNumberOne = firstName + " " + lastName + " " + copyright;
        System.out.println("Первый студент, который у нас зарегистрировался, это - " + studentNumberOne);

    }

    public static void myLovelyCharAndString() {
        char numberOne = ' ';
        String numberTwo = " ";
        String firstName = "Alex";
        String lastName = "Topolcean";
        char copyright = '\u00A9';
        String studentNumberOne = firstName + ' ' + lastName + ' ' + copyright;
        System.out.println(studentNumberOne);
        int dlina;
        dlina = studentNumberOne.length();
        System.out.println(dlina);
        String myVeryNewString = studentNumberOne.substring(10); // обрезает первые 10 символов
        System.out.println(myVeryNewString);
        myVeryNewString = studentNumberOne.substring(3, 8); // обрезает с 3 по 8 символы
        System.out.println(myVeryNewString);

    }

}
