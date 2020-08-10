package lesson06;

public class HelloSwitchCase {
    public static void main(String[] args) {
        int customerValue1 = 1;
        int customerValue2 = 2;
        int customerValue3 = 3;
        int customerValue4 = 4;
        int customerValue5 = 5;
        int customerValue6 = 10;
        int customerValue7 = 55;

        String fromCoffeeVendingMachine = coffeeVending(customerValue1);
        split();
        System.out.println(coffeeVending(1));
        split();
        System.out.println(coffeeVending(2));
        split();
        System.out.println(coffeeVending(3));
        split();
        System.out.println(coffeeVending(4));
        split();
        System.out.println(coffeeVending(5));
        split();
        System.out.println(coffeeVending(6));
        split();
        System.out.println(coffeeVending(7));
        split();


    }

    public static void split() {
        System.out.println("--------------------");
    }

    public static String coffeeVending(int customerValue) {
        String result = "";

        switch (customerValue) {
            case 1:
                result = "Кофе американо готовится";
                break;
            case 2:
                result = "Кипяток сейчас будет";
                break;
            case 3:
                result = "Кофе эспрессо готовится";
                break;
            case 4:
                result = "Какао уже летит";
                break;
            case 5:
                result = "Вода кипятится, " + "Кофе мелится, " + "Молоко добавляется";
                break;
            default:
                result = "Повторите, пожалуйста, свой выбор: " + customerValue + " временно недоступен";
                break;


        }
        //System.out.println("Программа приготовления кофе отработала без ошибок!");


        return result;
    }

}
