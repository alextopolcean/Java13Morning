package lesson04;

public class HelloChar {
    public static void main(String[] args) {
        goodMorningChar();

    }
    public static void goodMorningChar(){
        char c;
        c = 100;
        System.out.println("Char 100 = " + c);
        char anoterChar = '\u0400';
        char anotherChar2 = '\u0440';
        System.out.println(anoterChar);
        System.out.println(anotherChar2);
        char euro = '€';
        System.out.println(euro);
        char zeichen = 'A';
        System.out.println(zeichen);
        char specialSymbolTabulator = '\t';
        System.out.println(specialSymbolTabulator);
        char symbolAt = '\u0040';
        System.out.println(symbolAt);
        char copyright = '\u00A9';
        System.out.println(copyright);
        char registered = '\u00AE';
        System.out.println(registered);
        boolean bool = 3>5;
        System.out.println(bool);
    }
}
