package lesson36;

public class MyLovelyArrays {
    public static void main(String[] args) {
        myLovelyTwoDimensionalArray();

    }

    public static void myLovelyTwoDimensionalArray() {
        String[][] myArray = new String[5][3];
        myArray[0][0] = "1";
        myArray[0][1] = "Путин";
        myArray[0][1] = "No 123456";

        myArray[1][0] = "2";
        myArray[1][1] = "Медведев";
        myArray[1][2] = "No 234567";

        myArray[1][0] = "3";
        myArray[1][1] = "Меркель";
        myArray[1][2] = "No 5465326";

        myArray[1][0] = "4";
        myArray[1][1] = "Алиев";
        myArray[1][2] = "No 4546656";

        myArray[1][0] = "5";
        myArray[1][1] = "Епифанов";
        myArray[1][2] = "No 5656566";


        myPrintForStringTwo(myArray);
    }

    private static void myPrintForStringTwo(String[][] s) {
        System.out.println(s.length);
        System.out.println(s[0].length);
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {
                System.out.print(s[i][j] + ", ");
            }
            System.out.println();

        }
    }
}
