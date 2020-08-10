package lesson19;

public class Test {
    public static void main(String[] args) {
        System.out.println(testSpaceDelete("prosto stroka"));

    }
    public static String testSpaceDelete (String input){
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' '){
                output = output + input.charAt(i);

            }

        }


        return output;
    }

}
