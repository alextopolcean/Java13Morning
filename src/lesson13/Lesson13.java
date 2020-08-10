package lesson13;

public class Lesson13 {

    public static void main(String[] args) {
        first(10);

    }
    public static void  first (int line) {
        String divider = " ";
        String output2 = "";
        String star = "*";
        String output = "";
        for (int i = 0; i < line ; i++) {
            output = output + star;
            output2 = output2 + divider;

        }
        String empty = "";
        for (int i = 0; i < line ; i++) {
            empty = output.substring(0,line);

        }
        String finalVariable = "";
        for (int i = 1; i < line; i++) {
            finalVariable = output.substring(0, output.length()-1) + output2.substring(output.length()-i);
            System.out.println(finalVariable);

        }
    }

}
