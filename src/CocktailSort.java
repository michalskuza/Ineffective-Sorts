import java.util.Arrays;

public class CocktailSort {
    public static void cocktailSort( int[] input ) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i <= input.length - 2; i++) {
                if (input[i] > input[i + 1]) {
                    int temp = input[i];
                    input[i] = input[i + 1];
                    input[i + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
            swapped = false;
            for (int i = input.length - 2; i >= 0; i--) {
                if (input[i] > input[i + 1]) {
                    int temp = input[i];
                    input[i] = input[i + 1];
                    input[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }

    public static void main(String[] args) {
        int[] a = { 3, 12, 17, 10,  4, 18,  8,  7,  1, 15, 16, 14, 20, 13,  2, 19,  9, 11,  6,  5};
        System.out.println(Arrays.toString(a));
        cocktailSort(a);
        System.out.println(Arrays.toString(a));
    }
}
