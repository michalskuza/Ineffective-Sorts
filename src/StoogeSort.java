import java.util.Arrays;

public class StoogeSort {
    public static void stoogeSort(int[] L) {
        stoogeSort(L, 0, L.length - 1);
    }

    public static void stoogeSort(int[] L, int i, int j) {
        if (L[j] < L[i]) {
            int tmp = L[i];
            L[i] = L[j];
            L[j] = tmp;
        }
        if (j - i > 1) {
            int t = (j - i + 1) / 3;
            stoogeSort(L, i, j - t);
            stoogeSort(L, i + t, j);
            stoogeSort(L, i, j - t);
        }
    }

    public static void main(String[] args) {
        int[] a = { 3, 12, 17, 10,  4, 18,  8,  7,  1, 15, 16, 14, 20, 13,  2, 19,  9, 11,  6,  5};

        System.out.println(Arrays.toString(a));

        stoogeSort(a);

        System.out.println(Arrays.toString(a));
    }
}
