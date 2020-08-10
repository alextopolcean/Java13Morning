package lesson30;

public class HW30 {

    public static void main(String[] args) {
        System.out.println(".................");
        System.out.println("Наибольший общий делитель чисел A и В => " + nod(680, 612));
        System.out.println(".................");
        System.out.println("Наименьшее общее кратное чисел A и В => " + nok(25, 70));
        System.out.println(".................");
        System.out.println(arrayChar());


    }

    // Найти НОД(наибольший общий делитель)
    public static int nod(int a, int b) {
        while (a != b) {
            if (a > b) a = a - b;
            else b = b - a;
        }

        return b;
    }

    // Найти НОК (Наименьшее общее кратное)
    public static int nok(int a, int b) {

        return a * (b / nod(a, b));
    }

    // Создать и распечать массив char
    public static char[] arrayChar() {
        char[] myChar = new char[]{'a', 'b', 'c', 'd', '@', '€', '*', '§', '"', '$', '?', '[', ']', 'l', 'o',};
        return myChar;
    }

}





