package lesson11;

public class Relation {
    public static void main(String[] args) {
        System.out.println(relationMoskowToBerlin());
        System.out.println(relationSquareToSquare(300,800));
        System.out.println(relationSquareToSquare( 250,500));

    }

    public static double relationMoskowToBerlin() {
        double moskow = 2500;
        double berlin = 800;
        return moskow / berlin;
    }

    public static double relationSquareToSquare(double s1, double s2) {
        if (s1 >= s2) {
            return s1 / s2;

        } else {

            return s2 / s1;
        }
    }
}

