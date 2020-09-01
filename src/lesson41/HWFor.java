package lesson41;

public class HWFor {
    public static void main(String[] args) {
        //System.out.println(hwFor(6));
        hwFor(6);
    }

    public static String hwFor(int linien) {
        String output = "";
        for (int i = 1; i <= linien; i++) {
           output =  i + output;
            for (int j = 1; j <= i; j++) {
                output = output  += j;
                System.out.println(output);
            }
            System.out.println(output);
            //System.out.println(output);

        }
        //output = output + linien;

        return output ;
    }
}
