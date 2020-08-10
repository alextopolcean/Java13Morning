package lesson19;

public class Polindrom {
    public static void main(String[] args) {
        //System.out.println(checkPalindrom("А роза упала на лапу Азора")); // при копировании происходит ошибка
        System.out.println(checkPalindrom("А роза упала на лапу Азора")+  "  <= А роза упала на лапу Азора");
        System.out.println(checkPalindrom("поп") + "  <= поп");
        System.out.println(checkPalindrom("школа") + " <= школа" );
        System.out.println("............................");
        System.out.println(deleteSpace("A  l  e        x")); // выведет Alex


    }

    public static boolean checkPalindrom(String input) {
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            output = input.charAt(i) + output;




        }

        input = deleteSpace(input).toLowerCase();
        output = deleteSpace(output).toLowerCase();


        return input.equals(output);
    }

    public static String deleteSpace(String input) {
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            //if (!(input.substring(i,i+1).equals(" "))){
            if (input.charAt(i) != ' ') {
                output = output + input.charAt(i);

            }

        }

        return output;

    }
}
