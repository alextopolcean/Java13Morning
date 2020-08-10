package lesson35;

public class HWMaxTriple {
    public static void main(String[] args) {
        System.out.println(maxTriple(new int[]{1, 7, 2, 8, 3}));
        System.out.println(maxTriple(new int[]{1, 7, 2, 8, 3}));
        System.out.println(maxTriple(new int[]{9,2,1,5,8}));
        System.out.println(maxTriple(new int[]{3,9,7}));

    }

    public static int maxTriple(int[] input) {
        int result = 0;
        int start = input[0];
        result = start;
        int middle = input[input.length / 2];
        int end = input[input.length - 1];

        if (middle > start) {
            result = middle;
        }
        if (end > start) {
            result = end;
        }


        return result;
    }
}
