package lesson38;

public class HW38 {
    public static void main(String[] args) {
        System.out.println("([2, 1, 2, 3, 4])  → Ожидаем 3 => " + countEvens(new int[]{2, 1, 2, 3, 4})); // 3
        System.out.println("([2, 2, 0])        → Ожидаем 3 => " + countEvens(new int[]{2, 2, 0})); // 3
        System.out.println("([1, 3, 5])        → Ожидаем 0 => " + countEvens(new int[]{1, 3, 5})); // 0
        System.out.println("...................................");
        System.out.println("([1, 2, 2, 1])     → Ожидаем 6 => " + sum13(new int[]{1, 2, 2, 1}));
        System.out.println("([1, 1])           → Ожидаем 2 => " + sum13(new int[]{1, 1}));
        System.out.println("([1, 2, 2, 1, 13]) → Ожидаем 6 => " + sum13(new int[]{1, 2, 2, 1, 13}));
    }


    // Return the number of even ints in the given array.
    // Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.
    // Вернуть количество четных целых чисел в данном массиве.
    // Примечание: оператор% "mod" вычисляет остаток, например 5% 2 равно 1.
    // countEvens([2, 1, 2, 3, 4]) → 3
    // countEvens([2, 2, 0]) → 3
    // countEvens([1, 3, 5]) → 0

    private static int countEvens(int[] zahlen) {
        int gerade = 0;
        for (int i = 0; i < zahlen.length; i++) {
            if (zahlen[i] % 2 == 0) {
                gerade++;
            }
        }
        return gerade;
    }

    // Return the sum of the numbers in the array, returning 0 for an empty array.
    // Except the number 13 is very unlucky, so it does not count and numbers that
    // come immediately after a 13 also do not count.
    // Возвращает сумму чисел в массиве, возвращая значение 0 для пустого массива.
    // За исключением того, что число 13 очень неудачно, поэтому оно не считается,
    // и числа, следующие сразу после 13, также не считаются.
    // sum13([1, 2, 2, 1]) → 6
    // sum13([1, 1]) → 2
    // sum13([1, 2, 2, 1, 13]) → 6

    public static int sum13(int[] zahlen) {
        int summe = 0;
        for (int i = 0; i < zahlen.length; i++) {
            if (zahlen[i] == 13) {
                i++;
            } else {
                summe += zahlen[i];
            }
        }

        return summe;
    }

    // Consider the leftmost and righmost appearances of some value in an array. We'll say that the "span" is the number of
    // elements between the two inclusive. A single value has a span of 1. Returns the largest span found in the
    // given array.
    // (Efficiency is not a priority.)
    // Рассмотрим крайнее левое и крайнее правое появление некоторого значения в массиве. Мы скажем, что «диапазон» -
    // это количество элементов между двумя включительно.
    // Одно значение имеет диапазон 1. Возвращает самый большой диапазон, найденный в данном массиве. (Эффективность не является приоритетом.)

    // maxSpan([1, 2, 1, 1, 3]) → 4
    // maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6
    // maxSpan([1, 4, 2, 1, 4, 4, 4]) → 6

    public static int maxSpan(int[]b){
        int spanLast = 0;
        int spanFirst = 0;
        int find = 0;
        int find2 = 0;
        for (int i = 0; i <b.length ; i++) {
            if(b[i]==b[b.length-1]){
                find++;
                if(find==1){
                    spanLast = b.length-1;
                }
            }


        }
        for (int i = b.length-1; i >=0; i--) {
            if(b[i]==b[0]){
                find2++;
            }

        }

        return 0;
    }

    // Мастеру плиточнику Сергею Ивановичу Золотыеруки задают часто один и тот же вопрос. Сколько будет стоить положить плитку на определённом участке.
    //Нам известно, что в час он кладёт примерно один квадратный метр плитки.
    //Его час стоит 27€ без НДС.
    //Стандартная плитка 30 на 20 сантиметров.
    //Сергей Иванович обратился к нам за помощью и вам надо написать для него программу.
    //Которая будет принимать размеры стены/пола, стоимость плитки и выдавать:
    //Количество требуемых плиток, как целых, так и тех которые надо будет резать. Учтите, что плитку можно класть как вдоль,
    //так и поперёк и только на месте мастер узнает, как именно её надо класть.
    //Стоимость материала
    //Стоимость рабочего времени
    //Итоговую ориентировочную стоимость
    

}
