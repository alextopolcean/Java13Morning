package lesson17;

public class EcserciseString02 {
    public static void main(String[] args) {
        System.out.println(left2("Hello"));
        System.out.println(left2("Hi"));

    }
    public static String left2(String str){


        return str.substring(2) + str.substring(0,2);
    }
}
