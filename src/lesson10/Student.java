package lesson10;

public class Student {
    public static void main(String[] args) {
        String studen1 = "Даша";
        String studen2 = "Саша";
        String studen3 = "Маша";
        String studen4 = "Паша";
        String studen5 = "Наташа";
        String studen6 = "Глаша";

        System.out.println(schollNote(studen1));
        System.out.println(schollNote(studen2));
        System.out.println(schollNote(studen3));
        System.out.println(schollNote(studen4));
        System.out.println(schollNote(studen5));
        System.out.println(schollNote(studen6));
        System.out.println("--------------------");
        System.out.println(schollNote("маша"));
        System.out.println(schollNote("саша"));
        System.out.println(schollNote("наташа"));


    }

    public static double schollNote(String name) {
        name = name.toLowerCase();

        double result = 0.0;

        switch (name) {

            case "даша":
                result = 5;
                break;
            case "саша":
                result = 5;
                break;
            case "маша":
                result = 4;
                break;
            case "паша":
                result = 3.5;
                break;
            case "наташа":
                result = 4.5;
                break;
            case "алиев":
                result = 1;
                break;
            case "глаша":
                result = 4;
                break;
            default:
                result = 0.0;


        }


        return result;
    }
}
