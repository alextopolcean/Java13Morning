package lesson35;

import java.util.Arrays;


public class FizzBuzz {
    public static void main(String[] args) {
        fizzbuzz();
        System.out.println("....................");
        System.out.println(Arrays.toString(fizzbuzzTwo(1, 6)));
        System.out.println(Arrays.toString(fizzbuzzTwo(15, 25)));


    }

    public static void fizzbuzz() {
        for (int i = 0; i <= 100; i++) {
            //System.out.println(i);
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

    }

    private static String[] fizzbuzzTwo(int min, int max) {
        int range = max - min;
        String[] output = new String[range];
        for (int i = 0; i < range; i++) {
            if (min % 3 == 0 && min % 5 == 0) {
                output[i] = "Fizzbuzz";
            } else if (min % 3 == 0) {
                output[i] = "Fizz";
            } else if (min % 5 == 0) {
                output[i] = "Buzz";
            } else {
                output[i] = String.valueOf(min);

            }
            min++;
        }

        return output;
    }
}


