package lesson07;

public class HelloIfElse {

    public static void main(String[] args) {

        int customerAge;
        alcoholPermission(5);
        alcoholPermission(16);
        alcoholPermission(20);
        alcoholPermission(65);


        boolean permission = true;
        if (permission) {
            System.out.println("1111");
        } else {
            System.out.println("2222");

        }

    }

    public static void alcoholPermission(int age) {

        if (age<16){
            System.out.println("Алкоголь запрещён лицам до 16 лет");
        }else if (age >=16 & age <18){
            System.out.println("Разрешён только слабый алкоголь");

        }else {
            System.out.println("Разрешён весь алкоголь ");
        }

    }
}
