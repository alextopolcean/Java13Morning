package lesson13;

public class Uebungen {

    public static void main(String[] args) {
        System.out.println("*************************");
        happyDumpling();
        System.out.println("*************************");
        findVariables();
        System.out.println("*************************");
        myLife();
        System.out.println("*************************");
        alphabet();
        System.out.println("*************************");
        System.out.println(repeatSymbol("z", 10));
        System.out.println("*************************");
        fibonacci();
        System.out.println("*************************");
        String variable1 = "Andrej";
        System.out.println(variable1.substring(0, 1));
        System.out.println("*************************");
        System.out.println(reverseNumber(123));
        System.out.println(reverseNumber(256));

    }
    /*Существует такая традиция: при приготовлении пельменей в один из них кладут монетку на счастье. Считается, что тому, кому попадется пельмень с монеткой, улыбнется удача.
      Представим, что у нас есть кастрюля, в которой лежит 10 пельменей.
      Один из них счастливый — а именно пятый пельмень.
      Давайте напишем программу, которая ищет счастливый пельмень.
      Программа перебирает пельмени в кастрюле по одному,
      и когда доходит до пятого пельменя — напишет “Вот счастливый пельмень!” и выходит из цикла.
     */

    public static void happyDumpling() {

        for (int i = 1; i < 10; i++) {
            if (i == 5) {

                System.out.println("Вот счастливый пельмень");
            }

        }
    }

    // Вывести на экран все числа от 1 до 100, которые делятся на 3 без остатка.

    public static void findVariables() {
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);

            }

        }
    }

    // Необходимо, чтоб программа выводила на экран вот такую последовательность:
    // myLine(100) -> 7 14 21 28 35 42 49 56 63 70 77 84 91 98

    public static void myLife() {
        for (int i = 7; i < 100; i += 7) {
            System.out.print(i + " ");


        }


    }

    // Вывести алфавит от A-Z по 4 шт. в строку

    public static void alphabet() {
        for (int i = 65; i <= 90; i++) {
            char char1 = (char) i;
            String str1 = String.valueOf(char1);
            System.out.println(repeatSymbol(str1, 7));


        }
    }

    public static String repeatSymbol(String symbol, int repeatNumber) {
        String output = "";
        for (int i = 0; i < repeatNumber; i++) {
            output = output + symbol;
        }
        return output;
    }

    /*Выведите на экран первые 11 членов последовательности Фибоначчи.
      первый и второй члены последовательности равны единицам
      а каждый следующий — сумме двух предыдущих
      То есть числа Фибоначчи - это 1 1 2 3 5 8 13 21 34 55 89 и т.д.
     */
    public static void fibonacci() {
        int n0 = 1;
        int n1 = 1;
        int n2;
        System.out.print(n0 + " " + n1 + " ");
        for (int i = 3; i <= 11; i++) {
            n2 = n0 + n1;
            System.out.print(n2 + " ");
            n0 = n1;
            n1 = n2;
        }
        System.out.println();
    }


    //Дано целое трехзначное число. Написать метод, который возвращает число, записанное в обратном порядке, например:
    //123 -> 321
    //768 -> 867

    public static int reverseNumber(int n) {
        String input = String.valueOf(n);
        String output = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            output = output + input.substring(i, i + 1);
           //System.out.print(output);

        }
        int result = Integer.parseInt(output);
        return result;
    }


    // Дано целое трехзначное число. Написать метод, который возвращает сумму разрядов этого числа, например:
    //123 -> 6  (1+2+3)
    //768 -> 21 (7+6+8)

    public static int sumNumbers (int n){




        return 0;
    }

}

