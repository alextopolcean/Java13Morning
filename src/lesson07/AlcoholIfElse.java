package lesson07;

public class AlcoholIfElse {

    public static void main(String[] args) {
        alcoholPermission2();
        split();
        ifElseKosmo();

    }

    public static void alcoholPermission2() {
        int возрастПокупателя = 17;
        if (возрастПокупателя < 16) {
            System.out.println("Алкоголь и сигареты продавать нельзя!!!");
        } else if (возрастПокупателя < 18) {
            System.out.println("Водку продавать ещё нельзя, а пиво и сигареты уже можно");
        } else {
            System.out.println("Можно продавать алкоголь и сигареты");
        }

    }

    public static void ifElseKosmo() {
        int a = 5;
        final int SUPERCONSTANT_G = 10;
// модификатор final обозначает константность переменной, которую невозможно изменить.
// например, ускорение свободного падения на поверхности Земли или
// PI, которое всегда константо. Кроме этой особенности final на результаты вычисления
// не влияет
        if (a < SUPERCONSTANT_G) {
            System.out.println("Первоночальное ускорение недостаточно");
            System.out.println("Ракета не может стартовать");
            System.out.println("Подготовить аварийные службы");
        } else {
            System.out.println("Ракета улетает в космос");
            System.out.println("Выпустить пресс-релиз об успешном запуске");
            System.out.println("Подготовить программистов к государственным наградам");
        }
    }
    public static void split (){
        System.out.println("-----------------------");
    }
}

