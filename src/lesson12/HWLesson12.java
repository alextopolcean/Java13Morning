package lesson12;

public class HWLesson12 {
    public static void main(String[] args) {
        piramide(10);

    }

    /* Вывести на экран данное изображение в другую сторону!
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

    public static void piramide(int line) {
        String star = "*";
        String space = "          ";

        for (int i = 0; i < line; i++) {

            space = space + star;

            space = space.substring(1, space.length() - 1);

            System.out.println(space += star);

        }

    }
}
