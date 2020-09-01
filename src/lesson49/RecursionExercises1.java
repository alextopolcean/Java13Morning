package lesson49;

public class RecursionExercises1 {
    public static void main(String[] args) {
        System.out.println(countX("xxhixx"));// → 4
        System.out.println(countX("xhixhix"));// → 3
        System.out.println(countX("hi"));// → 0
        System.out.println("---------------------");
        System.out.println(changePi("xpix"));// → "x3.14x"
        System.out.println(changePi("pipi"));// → "3.143.14"
        System.out.println(changePi("pip"));// → "3.14p"

    }
    // Given a string, compute recursively (no loops) the number of lowercase ‘x’ chars in the string.
    // Получив строку, вычислите рекурсивно (без циклов) количество строчных символов ‘x’ в строке.

    public static int countX(String input) {
        if (input.length() == 0) {
            return 0;
        }
        if (input.charAt(0) == 'x') {
            return 1 + countX(input.substring(1));
        }

        return countX(input.substring(1));
    }


    // Given a string, compute recursively (no loops) a new string where all appearances of “pi” have been replaced by “3.14”.
    // Получив строку, вычислите рекурсивно (без циклов) новую строку, в которой все появления “pi” были заменены
    // на“3.14”.

    public static String changePi (String input){
        if(input.length()<2){
            return input;
        }
        if(input.substring(0,2).equals("pi")){
            return "3.14" + changePi(input.substring(2));
        }

        return input.charAt(0) + changePi(input.substring(1));
    }
}
