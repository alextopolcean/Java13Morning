package lesson24;

public class Casar {
    public static void main(String[] args) {
        String input = "Съешь же ещё этих мягких французских булок, да выпей чаю.";
        String output = "Фэзыя йз зьи ахлш пвёнлш чугрщцкфнлш дцосн, жг еютзм ъгб.";
        System.out.println(enigmaCesar(input));
        String outputFromMetod = enigmaCesar(input);
        System.out.println(output.equals(outputFromMetod));

    }

    private static String enigmaCesar(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            result = result + genCesarChar(input.charAt(i));

        }
        return result;
    }

    public static char genCesarChar(char oneLetter) {
        char outputPlusThree = (char) (oneLetter+ 3);

        return outputPlusThree;
    }
}
