package lesson21;

import java.util.Scanner;

public class MyLovelyScanner {

    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // helloUser();
        findNumber(100);
    }

    public static void helloUser() {
        String name = "", surname = "", gender = "", email = "";
        int age = 0;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Как тебя зовут?");
        name = userInput.next();
        System.out.println("Какая у тебя фамилия?");
        surname = userInput.next();
        System.out.println("Твой пол?");
        gender = userInput.next();
        System.out.println("Твоя электронная почта?");
        email = userInput.next();
        System.out.println("Сколько тебе лет?");
        age = userInput.nextInt();


        System.out.println("Добро пожаловать на сайт, " + name);
        System.out.println("Проверь свои данные: " + name + " " + surname + " " + gender + " " + email + " " + age);


    }

    public static void findNumber(int n) {
        int userNumber = 0;
        int number = (int) (Math.random() * ((n - 1) + 1)) + 1;
        System.out.println(number);


        for (int i = 1; i <= 3; i++) {
            Scanner userInput = new Scanner(System.in);
            System.out.println(i + " попытка");
            userNumber = userInput.nextInt();


            if (number > userNumber) {
                System.out.println("Не угадали. Загадайте число больше");
            } else if (number < userNumber) {
                System.out.println("Не угадали. Загадайте число меньше");
            } else
                System.out.println("Вы угадали! УРА!");

        }
        System.out.println("Попытки закончились");
    }


}
