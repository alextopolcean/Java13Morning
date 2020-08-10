package lesson22;


public class BooleanExercises {
    public static void main(String[] args) {
        System.out.println(cigarParty(30, false)); // false
        System.out.println(cigarParty(50, false)); // false
        System.out.println(cigarParty(70, true)); // true
        System.out.println("--------------------");
        System.out.println(smartDepositBox(true, false)); // -> true
        System.out.println(smartDepositBox(false, true)); // -> true
        System.out.println(smartDepositBox(false, false)); // -> false
        System.out.println("--------------------");
        System.out.println(smartDepositBoxTwo(true, false)); //  -> false
        System.out.println(smartDepositBoxTwo(false, true)); // -> false
        System.out.println(smartDepositBoxTwo(false, false)); // -> false
        System.out.println(smartDepositBoxTwo(true, true)); // -> true
    }

    /*
    Когда белки собираются на вечеринку, им нравится пить сигары. Белковая вечеринка успешна, когда количество сигар
    от 40 до 60 включительно. Если это не выходные, в этом случае не существует верхней границы количества сигар.
    Верните true, если партия с заданными значениями успешна, или false в противном случае.
     */
    private static boolean cigarParty(int n, boolean b) {
        if (n >= 40 && n <= 60) {
            return true;
        } else if (n > 60) {
            return true;
        }

        return false;
    }

    // Родители Васи Сидорова купили умный сейф и запрограммировали его
    // на выдачу денег по отпечатку пальцев одного из родителей.

    public static boolean smartDepositBox(boolean mama, boolean papa) {
        return mama || mama;
    }

    /*
    После покупки сейфа в семье начался разлад по поводу выделению сыну денег и родители решили сейф перепрограммировать,
    таким образом, что бы он выдавал деньги только при обоюдном согласии родителей.
     */

    public static boolean smartDepositBoxTwo(boolean mama, boolean papa) {

        return mama && papa;
    }

    /*
    К родителям Васи Сидорова приехала Бабушка и сказала, что родители не умеют воспитывать сына и она сама знает,
    когда давать ребёнку деньги. Напишите программу выдачи денег Васе,
    если бабушка выдаёт деньги независимо от решения родителей.
     */

    public static boolean smartDepositBoxTree(boolean mama, boolean papa, boolean oma) {

        return mama && papa || oma;
    }


    /*
    На даче у родителей Васи Сидорова решили поставить звонок, который должен звонить
    при нажатии на кнопку звонка у калитки или у двери дома.
    Если соседские дети начинают играться и нажимать на кнопки звонка одновременно и на калитке и на доме,
    звонок не должен реагировать. Напишите программу управления звонком.
     */

    public static boolean doorbell(boolean bell1, boolean bell2) {

        return bell1 != bell2;

    }
}
