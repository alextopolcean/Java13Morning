package lesson35;

public class HW36ArrayCharOfCirillicAlphabet {

    public static void main(String[] args) {
        ArraysOfCirillicAlphabet();
        CharArrays();
        cirillicAlphabet();
        cirillicAlphabetRandom();

    }

    public static String[] CirillicAlphabet(char[] vokal) {
        String[] output = new String[33];
        for (int i = 0; i < vokal.length; i++) {
            return output;

        }


        return output;
    }

    public static void cirillicAlphabet() {
        String letters = "А Б В Г Д Е Ё Ж З И Й К Л М Н О П Р С Т У Ф Х Ц Ч Ш Щ Ъ Ы Ь Э Ю Я";
        char[] symbols = new char[letters.length()];
        int i = 0;
        for (char letter : letters.toCharArray()) {
            symbols[i] = letter;
            i++;
        }

        System.out.println(symbols);

    }
    public static void cirillicAlphabetRandom() {
        String letters = "А Б В Г Д Е Ё Ж З И Й К Л М Н О П Р С Т У Ф Х Ц Ч Ш Щ Ъ Ы Ь Э Ю Я";
        char[] symbols = new char[letters.length()];
        int i = 0;
        for (char letter : letters.toCharArray()) {
            symbols[i] = symbols[(int)(Math.random())*letter];
            i++;
        }

        System.out.println(symbols);
    }


    public static void ArraysOfCirillicAlphabet() {
        char[] alphabet = new String("А Б В Г Д Е Ё Ж З И Й К Л М Н О П Р С Т У Ф Х Ц Ч Ш Щ Ъ Ы Ь Э Ю Я").toCharArray();
        System.out.println(alphabet);


    }

    public static void CharArrays() {
        char[] bukvy = new char[33];
        System.out.println(new char[]{'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З',
                'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У',
                'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 'Ы', 'Ь', 'Э', 'Я'});


    }
}
