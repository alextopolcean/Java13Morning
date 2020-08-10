package lesson10;

public class WarmUp {
    public static void main(String[] args) {
        System.out.println(missingChar("kitten", 1));
        System.out.println(missingChar("kitten", 0));
        System.out.println(missingChar("kitten", 4));
        System.out.println(missingChar("Andrej", 2));
        System.out.println(backAround("hello"));
        System.out.println(backAround("cat"));
        System.out.println(backAround("a"));


    }
    public static String missingChar (String s, int n){
        String output = "";
        output = s.substring(0,n) + s.substring(n+1);


        return output;
    }

    public static String backAround(String str){
        String output = "";
        int lastSymbol = str.length()-1;
        output = str.substring(lastSymbol);

        return output + str + output;
    }
}
