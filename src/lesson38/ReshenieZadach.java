package lesson38;

public class ReshenieZadach {
    public static void main(String[] args) {
        char[] myArray = createArrey(33);
        //System.out.println(myCyrrilicChar());
        // рандомное заполнение массива
        // перемешивание
        myPrint(myArray);
        char[]shakeArray = getShake(myArray);


    }

    private static char[] getShake(char[]eingabe) {
        char[]result = new char[eingabe.length];
        myPrint(result);

        for (int i = 0; i < result.length; i++) {
            int newPlace = (int)(Math.random() * result.length);
            char temp = result[i];
            result[i]=result[newPlace];

        }

        return result;
    }

    private static void myPrint(char[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");

        }
    }

    public static char[] createArrey(int length) {
        char[] output = new char[length];
        for (int i = 0; i < length; i++) {
            output[i] = myCyrrilicChar();

        }

        return output;
    }

    public static char myCyrrilicChar() {
        int min = 1072; // "a".codePointAt(0)
        int max = 1103;
        char randomCyrillicChar = (char) ((Math.random() * (max - min) + 1) + min);

        return randomCyrillicChar;
    }
}
