package lesson03;

public class MagicDouble {
    public static void main(String[] args) {
        int min = 30;
        int max = 100;
        int result = (int) ((Math.random() * (max - min) + 1 ) + min);
        System.out.println(result);
    }
}
