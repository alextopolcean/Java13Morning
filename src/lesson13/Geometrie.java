package lesson13;

public class Geometrie {

    public static void main(String[] args) {
        first("*", 10);
        second("*", 10);

    }

    public static void first(String divider, int countLines) {
        String line = "";
        for (int i = 0; i < countLines; i++) {
            line = line + divider;
            System.out.println(line);

        }
        System.out.println("----------------------");

        System.out.println(line);

        System.out.println("----------------------");


    }

    public static void second(String divider, int countLines) {
        String lineSpace = "";
        String lineStar = "";


        for (int i = 0; i <= countLines; i++) {
            lineSpace = lineSpace + divider;

        }
        String output = "";
        for (int i = 0; i < countLines; i++) {
            output = output + lineSpace.substring(lineSpace.length() - 1);
            lineSpace = lineSpace.substring(0, lineSpace.length() - 1);
            System.out.println(lineSpace);

        }
    }

}
