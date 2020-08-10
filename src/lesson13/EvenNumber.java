package lesson13;

public class EvenNumber {
    public static void main(String[] args) {
        System.out.println(findEvenNumber(45));
        listeMeEvenNumber(45);

    }
    public static void listeMeEvenNumber(int range){
        for (int i = 0; i < range; i++) {
            if (findEvenNumber(i)){
                System.out.println(i);
            }

        }

    }
    public static boolean findEvenNumber (int number){
        return number % 2 == 0;
    }
}
