package lesson11;

public class HWLesson11 {

    public static void main(String[] args) {
        //homeWork1();
        homeWork2(10, 5);
        homeWork3(5, 17);
        homeWork4(3,10);
        homeWork5(10);

    }

    public static void homeWork1() {

        for (int i = 0; i < 20; i = i * 2) {
            System.out.println(i);

        }
    }

    // Даны целые числа A и B, где B > 0. Вывести B раз число A

    public static void homeWork2(int a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);

        }
    }

    // Вывести в порядке возрастания все числа между А и B, где а = 5, а B = 17

    public static void homeWork3(int a, int b) {
        for (int i = 5; i <= 17; i++) {
            System.out.println(i);

        }

    }

    // Сколько раз будет выведено сообщение на экран?

    public static void homeWork4(int a, int b) {
        for (int i = a; i < b; i++) {
            System.out.println(i);

        }

    }
    /* Нарисуйте" (выведите на консоль) треугольник из звёздочек, используя только одну звёздочку и то, что только что
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

    public static void homeWork5(int line) {
        String star = "*";
        String output = "";
        for (int i = 0; i < line; i++) {
            //System.out.println(output += star);
            output = output + star;
            System.out.println(output);

        }

    }

}
