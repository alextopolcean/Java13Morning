package lesson32;

public class Review {
    public static void main(String[] args) {
        //System.out.println(Arrays.toString(sum(new int[]{3, 5, 8})));
        citiesTable("Leipzig", "Praha", "München");
        System.out.println("..................");
        System.out.println(charToString('A', 'l', 'e', 'x'));


    }

    private static int sum(int[] input) {
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            sum += input[i];

        }


        return sum;
    }

    public static void citiesTable(String... cities) {
        for (String elementik : cities) {
            System.out.println(elementik);
        }
    }

    public static String charToString(char... symbols) {
        String output = "";
        for (int i = 0; i < symbols.length; i++) {
            output += symbols[i];
        }
        return output;
    }
}

