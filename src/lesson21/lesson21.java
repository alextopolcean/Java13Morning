package lesson21;

public class lesson21 {

    public static void main(String[] args) {
        System.out.println(citiWeather("Berlin", "Montag"));
        System.out.println(citiWeather("London", "Dienstag"));
        System.out.println(citiWeather("Lissabon", "Mittwoch"));
        System.out.println(citiWeather("Minsk", "Sonntag"));
        System.out.println(citiWeather("Berlin", "Donnerstag"));
        System.out.println(citiWeather("London", "Freitag"));
        System.out.println(citiWeather("Minsk", "Montag"));


    }

    public static int citiWeather(String city, String weekday) {
        int degreeUp = 0;

        switch (weekday) {
            case "Montag":
                degreeUp = 0;
                break;
            case "Dienstag":
                degreeUp = 1;
                break;
            case "Mittwoch":
                degreeUp = 2;
                break;
            case "Donnerstag":
                degreeUp = 3;
                break;
            case "Freitag":
                degreeUp = 4;
                break;
            case "Samstag":
                degreeUp = 5;
                break;
            case "Sonntag":
                degreeUp = 6;
                break;
            default:
                degreeUp = 0;
        }


        return degreeUp + cityWeatherSimple(city) - 6;


    }

    public static int cityWeatherSimple(String city) {
        int degree = 0;

        switch (city) {
            case "Berlin":
                degree = 20;
                break;
            case "London":
                degree = 17;
                break;
            case "Lissabon":
                degree = 25;
                break;
            case "Minsk":
                degree = 18;
                break;
            default:
                degree = 0;

        }


        return degree + 6;
    }
}
