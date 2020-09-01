package lesson51;

public class HomeWork {
    public static void main(String[] args) {

        System.out.println(endX("xxre"));//→ "rexx"
        System.out.println(endX("xxhixx"));// → "hixxxx"
        System.out.println(endX("xhixhix"));// → "hihixxx"
        System.out.println("-------");
        System.out.println(count11("11abc11"));// → 2
        System.out.println(count11("abc11x11x11"));// → 3
        System.out.println(count11("111"));// → 1
        System.out.println("-------");
        System.out.println(parenBit("xyz(abc)123"));// → "(abc)"
        System.out.println(parenBit("x(hello)"));// → "(hello)"
        System.out.println(parenBit("(xy)1"));// → "(xy)"
        System.out.println("-------");
        System.out.println(strCopies("catcowcat", "cat", 2));// → true
        System.out.println(strCopies("catcowcat", "cow", 2));// → false
        System.out.println(strCopies("catcowcat", "cow", 1));// → true
        System.out.println("--------");
        System.out.println(fibonacci(0));// → 0
        System.out.println(fibonacci(1));// → 1
        System.out.println(fibonacci(2));// → 1


    }

    // Для данной строки рекурсивно вычислить новую строку, в которой все строчные символы x ’были перемещены в конец строки.

    public static String endX(String str) {
        if (str.length() == 0) return "";

        if (str.charAt(0) == 'x') {
            return endX(str.substring(1)) + "x";
        }
        return str.charAt(0) + endX(str.substring(1));
    }
    public static int count11(String str) {
        if (str.length()<2)
            return 0;

        int count = (str.substring(0,2).equals("11")) ? 1 : 0;
        int jump = (count==1) ? 2 : 1;

        return count + count11(str.substring(jump));
    }

    public static  String parenBit(String str) {
        if (str.charAt(0) != '(') {
            return parenBit(str.substring(1));
        }
        if (str.charAt(str.length()-1) != ')') {
            return parenBit(str.substring(0, str.length()-1));
        }
        return str;
    }
    public static boolean strCopies(String str, String sub, int n) {
        if(n == 0)
            return true;
        if(str.length() < sub.length())
            return false;
        if(str.substring(0,sub.length()).equals(sub))
            return strCopies(str.substring(1), sub, n-1);
        return strCopies(str.substring(1), sub, n);
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 2) + fibonacci(n - 1);
    }

}
