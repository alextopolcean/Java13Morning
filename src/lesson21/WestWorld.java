package lesson21;

import java.util.Scanner;

public class WestWorld {
    public static void main(String[] args) {
        game();
    }

    private static void game() {
        int k = 0;
        System.out.println("Какой уровень сложности Вы хотите? + \n" +
                "Лёгкий (1)? Или для взрослых (2)? Введите 1 или 2");
        Scanner input = new Scanner(System.in);
        int userGameK = input.nextInt();
    }
}
