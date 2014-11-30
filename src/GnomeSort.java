import java.util.Arrays;

public class GnomeSort {
    public static void gnomeSort(int[] a) {
        int i = 1;
        int j = 2;

        while (i < a.length) {
            if (a[i - 1] <= a[i]) {
                i = j;
                j++;
            } else {
                int tmp = a[i - 1];
                a[i - 1] = a[i];
                a[i--] = tmp;
                i = (i == 0) ? j++ : i;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {3, 12, 17, 10, 4, 18, 8, 7, 1, 15, 16, 14, 20, 13, 2, 19, 9, 11, 6, 5};
        System.out.println(Arrays.toString(a));
        gnomeSort(a);
        System.out.println(Arrays.toString(a));
    }
}
