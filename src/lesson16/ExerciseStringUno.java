package lesson16;

public class ExerciseStringUno {
    public static void main(String[] args) {
       // System.out.println(nelloName("Bob"));
        //System.out.println("**********************");
        //System.out.println(makeOutWord("<< >>", "WooHoo"));
        //System.out.println("**********************");
        //System.out.println("**********************");

    }
    public static String nelloName (String name){
    String hallo = "Hello ";
    String symbol = "!";
    char qoutationMark = '"';
    String result = qoutationMark + hallo.concat(name + symbol)+ qoutationMark;
    return result;

    }
    public static String makeOutWord (String symbol, String word){
       // String start = "";
        //symbol = symbol.substring(0,symbol.length()/2);
        //System.out.println(symbol);



        return symbol.substring(0,symbol.length()/2) + word +symbol.substring(0,symbol.length()/2);
    }

    public static String nonStart (String a, String b){


        return a.substring(1) + b.substring(1);

    }

    public static boolean endsLy (String str){


        return str.endsWith("ly");
    }



}
