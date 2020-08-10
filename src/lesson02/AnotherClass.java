package lesson02;

public class AnotherClass {
    public static void main(String[] args) {
        addition();
        shoppingList();

    }

    private static void shoppingList() {
        System.out.println("Купи");
        System.out.println("Хлеб");
        System.out.println("Молоко");
        System.out.println("Сахар");
    }

    public static void addition(){
        System.out.println(5 + 3); // выведет арифметическое действие 5+3 = "8"
        System.out.println("5 + 3"); // выведет строку "5 + 3"
    }


}
