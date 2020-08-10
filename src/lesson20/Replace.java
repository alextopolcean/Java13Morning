package lesson20;

public class Replace {
    public static void main(String[] args) {
        System.out.println("...........................");
        String s1 = "q w e r t z";
        System.out.println(s1.replace(" ", ""));
        System.out.println(" a  b  c".replace(" ", ""));
        s1 = s1.replace(" ", "");
        System.out.println(s1);
        System.out.println("...........................");
        System.out.println(hw19_BobThere("bab"));
        System.out.println(hw19_BobThere("bambino"));
        System.out.println(hw19_BobThere("bob"));
        System.out.println("...........................");
        multiplikationTable(3);
    }

    public static boolean hw19_BobThere(String s) {
        char b = 'b';
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == b && s.charAt(i + 2) == b) {
                return true;
            }

        }


        return false;
    }

    // Реализовать метод печатающий таблицу умножения для заданного числа Пример: multiplicationTable(3)->
    // 3x1=3
    // 3x2=6
    // ….
    // 3x10=30
    public static void multiplikationTable(int digits) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(digits + " * " + i + " = " + digits * i);

        }

    }


}
