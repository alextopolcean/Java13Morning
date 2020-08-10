package lesson02;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello World!");
        System.out.println("Привет Мир!");
        // //(())==// (()) ?? {{ [[ ]] }} \\ --**//--
        System.out.println(); // выводим на экран пустую строчку
        customerInfo();
        System.out.println();
        thankYou();
        System.out.println();
        showByExit();
    }

    public static void customerInfo() {
        System.out.println("С Вас 3,60€!");
        System.out.println("Спасибо за покупку!");
    }

    public static void thankYou() {
        System.out.println("Спасибо за покупку!");

        System.out.println("А здесь будет выполняться арифметическая операция 3+5 = " + (3 + 5));
        System.out.println("Меня зовут Александр!");
    }

    public static void showByExit() {
        System.out.println("Приходите к нам ещё!");
    }
}
