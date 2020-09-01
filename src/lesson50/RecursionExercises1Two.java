package lesson50;

public class RecursionExercises1Two {
    public static void main(String[] args) {
        System.out.println(countAbc("abc")); // → 1
        System.out.println(countAbc("abcxxabc")); // → 2
        System.out.println(countAbc("abaxxaba")); // → 2
        System.out.println("----------------");
        System.out.println(countHi2("ahixhi")); // → 1
        System.out.println(countHi2("ahibhi")); // → 2
        System.out.println(countHi2("xhixhi")); // → 0
    }

    // Count recursively the total number of “abc” and “aba” substrings that appear in the given string.
    // Рекурсивно подсчитать общее количество подстрок «abc» и «aba», которые появляются в данной строке.

    public static int countAbc(String input) {
        String abc = "abc";
        String aba = "aba";
        if (input.length()<3){
            return 0;
        }
        if (input.substring(0, 3).equals(abc) || input.substring(0, 3).equals(aba)) {
            return 1 + countAbc(input.substring(1));
        }

        return countAbc(input.substring(1));
    }

    // Given a string, compute recursively the number of times lowercase “hi” appears in the string,
    // however do not count “hi” that have an ‘x’ immedately before them.
    // Для данной строки рекурсивно вычислите, сколько раз строчная буква «привет» появляется в строке,
    // однако не учитывает «привет», перед которым сразу стоит «х».

    public static int countHi2 (String input){

        return 0;
    }

    // Given a string and a non-empty substring sub, compute recursively the number of times that sub appears in the string,
    // without the sub strings overlapping.
    // Учитывая строку и непустую подстроку sub, рекурсивно вычислите, сколько раз эта подстрока появляется в строке без перекрытия подстрок.

}
