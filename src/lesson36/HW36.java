package lesson36;

public class HW36 {
    public static void main(String[] args) {
        cirillicAlphabet();

    }
    public static void cirillicAlphabet(){
        char[]alphabet = new char[]{'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З',
                'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У',
                'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 'Ы', 'Ь', 'Э', 'Я'};
        for (int i = 0; i < alphabet.length ; i++) {
            System.out.print(alphabet[i] + " ");

        }



    }
}
