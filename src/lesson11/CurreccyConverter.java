package lesson11;

public class CurreccyConverter {
    public static void main(String[] args) {
        //System.out.println(findCurrencyCourse("RUR""));
        System.out.println(findCurrencyCourse("eur"));

    }

    public static double currencySum (double amont, String inputName,String outputName){

        return 0.0;
    }

    public static double findTwoCurrentyCourse(String firstCurrencyName, String secontCurrencyName){

        return findCurrencyCourse(firstCurrencyName)/ findCurrencyCourse(secontCurrencyName);
    }

    public static double findCurrencyCourse(String currencyName){
        currencyName = currencyName.toUpperCase();
        double currencyCource = 0.0;
        switch (currencyName){
            case "EUR":
                currencyCource = 1.12;
                break;
            case "RUR":
                currencyCource = 0.014;
                break;
            case "USD":
                currencyCource = 1.0;
                break;
            case "GBP":
                currencyCource = 1.25;
                break;
            case "BYN":
                currencyCource = 0.41;
                break;
            case "UAH":
                currencyCource = 0.03;
                break;
            default:
                System.out.println(0.0);
        }


        return 0.0;
    }
}
