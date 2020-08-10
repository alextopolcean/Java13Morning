package lesson17;

public class HW {
    public static void main(String[] args) {

        while01(3, 5);
        System.out.println("----------");
        doWhile01(3, 5);
        System.out.println("---**---**---**---");
        System.out.println("---**---**---**---");
        System.out.println("---**---**---**---");
        while02(5, 17);
        System.out.println("----------");
        doWhile02(5, 17);
        System.out.println("---**---**---**---");
        System.out.println("---**---**---**---");
        System.out.println("---**---**---**---");
        while03(10);
        System.out.println("-----------");
        doWhile03(10);


    }

    // Даны целые числа A и B, где B > 0. Вывести B раз число A

    public static void while01(int a, int b) {
        int i = 0;
        while (i < b) {

            System.out.println(a);
            i++;
        }

    }

    // Вывести в порядке возрастания все числа между А и B, где а = 5, а B = 17

    public static void doWhile01(int a, int b) {
        int i = 0;
        do {
            System.out.println(a);
            i++;
        } while (i < b);

    }

    public static void while02(int a, int b) {
        int i = 5;
        while (i <= 17) {
            System.out.println(i);
            i++;

        }


    }

    public static void doWhile02(int a, int b) {
        int i = 5;
        do {
            System.out.println(i);
            i++;
        } while (i <= 17);
    }

    /*
    "Нарисуйте" (выведите на консоль) треугольник из звёздочек, используя только одну звёздочку и то, что только что
     изучили:
     *
     **
     ***
     ****
     *****
     ******
     *******
     ********
     *********
     **********
    */

    public static void while03(int line) {
        String star = "*";
        String output = "";
        int i = 0;
        while (i < line) {
            output = output + star;
            System.out.println(output);
            i++;
        }
    }

    public static void doWhile03(int line) {
        String star = "*";
        String output = "";

        int i = 0;
        do {
            output = output + star;
            System.out.println(output);
            i++;
        } while (i < line);
    }
}
