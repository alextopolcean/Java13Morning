package lesson31;

public class myFirstCharInit {
    public static void main(String[] args) {
        char[] myArray = new char[]{'a', 'b', 'c', '@', '$',};


        myPrintForCharArray(myArray);
        myPrintForCharArray(fillArrayRandomChar(myArray));
        boolean[] b = new boolean[10];
        System.out.println(" ");
        System.out.println("..................");
        myPrintForBooleanArray(b);

    }

    private static char[] fillArrayRandomChar(char[] ccc) {
        for (int i = 0; i < ccc.length; i++) {
            ccc[i] = (char) (Math.random() * 200);
        }
        return ccc;
    }

    public static void myPrintForCharArray(char[] ccc) {
        System.out.println("Символьный массив (char[]), длиной " + ccc.length);
        for (char c : ccc) {
            System.out.print(c + ", ");
        }
    }
    public static void myPrintForBooleanArray(boolean[] b){
        System.out.println("Массив с логическими данными, булевыми данными, длиной - "  + b.length);
        for (int i = 0; i < b.length - 1; i++) {
            System.out.print(b[i] + ", ");

        }
        System.out.println(b[b.length - 1] + ".");
    }
}
