package lesson08;

public class Calculator2 {
    public static void main(String[] args) {
        helloong();
        helloByte();

    }

    public static void helloong() {
        long a = 111111111L;
        long b = 222222222L;
        long c = 333_333_333L;
        long sum = a + b + c;
        System.out.println("Здесь должно быть большое число! Сумма а + в + с = " + sum);
    }
    public static void helloByte(){
        byte a = 111;
        short b = 1111;
        int c = 1_111_111;
        long d = 1_2_3_4_5L;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

    public static void hallyHalloByte() {

        
    }
}
