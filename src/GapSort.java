import java.util.Arrays;
import java.util.List;

public class GapSort {
    public static void gapSort (Comparable [] data, int size) {
        int index;
        int gap, top;
        Comparable temp;
        boolean exchanged;

        double SF = 1.3;
        gap = size;

        do {
            exchanged = false;
            gap = (int) (gap / SF);
            if (gap == 0){
                gap = 1;
            }
            for (index = 0; index <= size - gap; index++) {
                if (data [index].compareTo(data [index + gap]) > 0) {
                    temp = data [index];
                    data [index] = data [index + gap];
                    data [index + gap] = temp;
                    exchanged = true;
                }
            }
        } while (exchanged || gap > 1);
    }

    public static void main(String[] args) {
        Comparable[] input = "S O R T E X A M P L E".split(" ");
        int gap = input.length - 1;

        System.out.println(Arrays.toString(input));
        gapSort(input, gap);
        System.out.println(Arrays.toString(input));
    }
}
