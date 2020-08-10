package lesson04;

public class CalculatorTest {
    public static void main(String[] args) {
        int test = Calculator.addition(3, 5);
        System.out.println("Ожидаю 8, метод из калбкулятора!  = " + test);

        double secondTest = Calculator.division(7, 10);
        System.out.println("Ожидаю число меньше нуля, метод из калькулятора! = " + secondTest);

        int threeTest = Calculator.multiplication(4,5);
        System.out.println(threeTest);

        int vorTest = Calculator.multiplication(5,5);
        System.out.println(vorTest);
    }

    public static void myIntegers() {
        int i = 10;
        byte b = 20;
        short s = 56;
        long l = 1;
        double d = 50.0;
        float f = 75.0f;
        double test = Math.pow(d, f);
    }
}
