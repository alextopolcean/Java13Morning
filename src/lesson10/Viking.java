package lesson10;

public class Viking {
    public static void main(String[] args) {
        System.out.println(waysOfWiking1(1));
        System.out.println(waysOfWiking1(2));
        System.out.println(waysOfWiking1(3));
        System.out.println(waysOfWiking1(4));
        System.out.println("------------------------");
        System.out.println(waysOfViking2("налево"));
        System.out.println(waysOfViking2("направо"));
        System.out.println(waysOfViking2("прямо"));
        System.out.println(waysOfViking2("криво"));


    }

    public static String waysOfWiking1(int way) {

        String result = "";
        if (way == 1) {
            result = "Налево пойдёшь - Коня потеряешь";
        } else if (way == 2) {
            result = "Направо пойдёшь - Жизнь потеряешь";
        } else if (way == 3) {
            result = "Прямо пойдёшь - Счастье обретёшь";

        } else {
            result = "Ничего не найдёшь!!!";


        }
        return result;
    }

    public static String waysOfViking2(String way) {
        String result = "";

        switch (way) {
            case "налево":
                result = "Налево пойдёшь - Коня потеряешь";
                break;
            case "направо":
                result = "Направо пойдёшь - Жизнь потеряешь";
                break;
            case "прямо":
                result = "Прямо пойдёшь - Счастье обретёшь";
                break;
            default:
                result = "Повторите свой выбор!";
                break;
        }

        return result;
    }
}



