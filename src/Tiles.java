public class Tiles {
    public static void main(String[] args) {
        /*Мастеру плиточнику Сергею Ивановичу Золотыеруки задают часто один и тот же вопрос. Сколько будет стоить
        положить плитку на определённом участке.

        Нам известно, что в час он кладёт примерно один квадратный метр плитки.
                Его час стоит 27€ без НДС.
                Стандартная плитка 30 на 20 сантиметров.
                Сергей Иванович обратился к нам за помощью и вам надо написать для него программу.
                Которая будет принимать размеры стены/пола, стоимость плитки и выдавать:

        Количество требуемых плиток, как целых, так и тех которые надо будет резать.
        Учтите, что плитку можно класть как вдоль, так и поперёк и только на месте мастер узнает, как именно её надо класть.
        Стоимость материала
        Стоимость рабочего времени
        Итоговую ориентировочную стоимость
         */


        // 1 hour = 27€
        // 1 tile = 30*20 cm;
        // 1 hour = 1m³
        // размеры стены/пола, стоимость плитки

        int workingHour = 27;
        int floorWidth = 3;
        int floorLenght = 1;
        customerQuestion(27, 3, 2);
        System.out.println(tileQuantity(30, 20, 3, 6));
        System.out.println(priceMaterial(1));

    }

    public static void customerQuestion(double tilePrice, double floorLength, double floorWidth) {
        //tileQuantity();
        //priceMaterial();
        //priceWork();
        //totalPrice();


    }

    private static double priceMaterial(double tilePrice) {
        double quantity = tileQuantity(30, 20, 3, 6);

        return quantity * tilePrice;
    }

    private static double tileQuantity(double tileLength, double tireWidth, double floorLength, double floorWidth) {
        double quantity;
        floorLength = floorLength * 100;
        floorWidth = floorWidth * 100;
        quantity = (floorLength * floorWidth) / (tileLength * tireWidth);


        return quantity;
    }
}
