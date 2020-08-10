package lesson27;

public class lesson27 {
    public static void main(String[] args) {
        System.out.println(bunnyEars2One(0));// → 0
        System.out.println(bunnyEars2One(1));// → 2
        System.out.println(bunnyEars2One(2));// → 5
        System.out.println("....................");
        System.out.println(bunnyEars2Two(0));
        System.out.println(bunnyEars2Two(1));
        System.out.println(bunnyEars2Two(2));
        System.out.println(bunnyEars2Two(100));
        System.out.println("....................");
        System.out.println(count7Simple(717));// → 2
        System.out.println(count7Simple(7));// → 1
        System.out.println(count7Simple(123));// → 0
    }


    /*
    We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears.
    The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot.
    Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

    У нас есть очередь из кроликов и мы получаем количество стоящих в этой очереди кроликов. У нечётных кроликов
    по два уха. А у чётных кроликов вроде как по три уха. Это из-за того, что они все подняли ногу. Посчитайте
    количество видимых нами "ушей". Не использовать циклы или умножение.
     */
    private static int bunnyEars2One(int rabbit) {
        int result = 0;
        result = rabbit * 2 + rabbit / 2;
        return result;
    }

    public static int bunnyEars2Two(int rabbit) {


        if (rabbit == 0) {
            return 0;
        }
        if (rabbit % 2 == 1) {
            return 2 + bunnyEars2Two(rabbit - 1);
        }


        return 3 + bunnyEars2Two(rabbit - 1);
    }

    /*
    Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2. (no loops).
    Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),
    while divide (/) by 10 removes the rightmost digit (126 / 10 is12).
    Дано положительное целочисленное N. Верните количество семёрок в числе. 717 - вернёт 2.
    Обратите внимание, что модуло 10 даёт вам правую цифру(126 % 10 равно 6), а деление на 10 удалит правую цифру(126 / 10
равно 12). Авторы задачи были к нам слишком добры и практически решили её прямов условии.
     */
    private static int count7Simple(int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (n % 10 == 7) {
                count++;
            }

        }

        return 0;
    }

}

