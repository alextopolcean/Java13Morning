package lesson20;


import lesson13.LeapYear;

public class LeapYear2 {
    public static void main(String[] args) {
        printLeapYear(2000,2009);
        

    }
    public static void printLeapYear(int year1, int year2){
        for (int i = year1; i <=year2 ; i++) {
            if(LeapYear.myLovelyLeapYearWithBoolean(i)){
                if(true){
                    System.out.println(i + " => Високосный год");
                }
            }
             System.out.println(i + " => Не високосный год");

        }
    }
}
