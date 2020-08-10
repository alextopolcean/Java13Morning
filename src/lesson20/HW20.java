package lesson20;

public class HW20 {
    public static void main(String[] args) {
        System.out.println(cityWeather("Минск", 1)); // 18
        System.out.println(cityWeather("Минск", 7)); // 24
        System.out.println(cityWeather("Minsk", 7)); // 24
        System.out.println("................");
        System.out.println(cityWeather("Париж", 1)); // 23
        System.out.println(cityWeather("Париж", 7)); // 29
        System.out.println("................");
        System.out.println(cityWeather("Лиссабон", 1)); // 25
        System.out.println(cityWeather("Лиссабон", 7)); // 31
        System.out.println(cityWeather("Лиссабон", 8)); // 0

    }

    public static int cityWeather(String stadt, int day) {

        int temp = 0;
        if (day <= 7) {
            for (int i = 1; i <= day; i++) {
                temp++;

                if (stadt == "Париж" || stadt == "Paris") {
                    temp = 23;
                    temp = temp + day - 1;
                } else if (stadt == "Минск" || stadt == "Minsk") {
                    temp = 18;
                    temp = temp + day - 1;
                } else if (stadt == "Лиссабон" || stadt == "Lissabon") {
                    temp = 25;
                    temp = temp + day - 1;
                } else if (stadt == "Москва" || stadt == "Moskau") {
                    temp = 19;
                    temp = temp + day - 1;
                }

                return temp;
            }

        }

        return 00;


    }
}
