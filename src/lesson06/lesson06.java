package lesson06;

public class lesson06 {


    public static void main(String[] args) {
        review();
        booleanReview();

        String myString = "Мой пример стрингового значения";
        int dlina = myString.length();
        String myNewString = myString.substring(0, 15);
        System.out.println("Привет Мир " + myNewString);

        System.out.println("Привет Мир =>" + myString);

        char c1 = '@';
        char c2 = 115;
        char c3 = '\u0440';
        String probel = " ";
        char p = ' ';

        System.out.println("" + c1 + c2 + c3);

    }


    public static void review() {
        int countStudents = 1;
        byte countMoney;
        short s = 45 + 34;
        short firstVariable = 45;
        short secondVariable = 34;
        System.out.println(firstVariable + secondVariable);
        long l = 575645565L; // 2^63 - 1
        int money = 10;
        int iphonePreis = 1000;
        int divisipon = money / iphonePreis;
        System.out.println(divisipon);
        double myLovelyDouble = 3.14;
        System.out.println(10.0 / 1000);
        System.out.println(Math.sqrt(myLovelyDouble));
        float myFloat = 45.9f;


    }

    public static void review2(){

    }

    public static void booleanReview(){

        // Конъюкция --- логическое и     &
        // Дизъюкция --- логическое или   |
        // Антиваленц
        // Отрицание

        boolean knowledge , freeWorkSpace, myNewJob;

        knowledge = true;
        freeWorkSpace = true;
        myNewJob = knowledge & freeWorkSpace;
        System.out.println(myNewJob);

        boolean permissionMother, permissionFather, walkingBoy;

        permissionFather = true;
        permissionMother = false;
        walkingBoy = permissionFather | permissionMother;
        System.out.println(walkingBoy);

    }
}
