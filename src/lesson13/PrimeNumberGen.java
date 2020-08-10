package lesson13;

public class PrimeNumberGen {
    public static void main(String[] args) {
        System.out.println(primeNumberOne(4));
        System.out.println("****************************");
        listMePleasePrimeNumber(10);
        System.out.println("****************************");
        primeNumberTwo(20);
        System.out.println("****************************");


    }

    public static void listMePleasePrimeNumber(int range) {
        for (int i = 2; i < range; i++) {
            if (primeNumberOne(i)) {
                System.out.println(i);
            }

        }
    }

    public static boolean primeNumberOne(int myCheckNumber) {
        for (int i = 2; i < myCheckNumber; i++) {
            if (myCheckNumber % i == 0) {
                return false;

            }


        }
        return true;

    }

    public static void primeNumberTwo(int range) {
        for (int i = 2; i < range; i++) {
            int count = 0;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) count++;


            }
            if (count < 2) {
                System.out.println(i);
            }

        }

    }

}

