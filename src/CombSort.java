import java.util.Arrays;
import java.util.List;

public class CombSort {
    public static <T extends Comparable<? super T>> void combSort(List<T>  input) {
        int gap = input.size();
        boolean swapped = true;
        while (gap > 1 || swapped) {
            if (gap > 1) {
                gap = (int) (gap / 1.3);
            }
            swapped = false;
            for (int i = 0; i + gap < input.size(); i++) {
                if (input.get(i).compareTo(input.get(i + gap)) > 0) {
                    T t = input.get(i);
                    input.set(i, input.get(i + gap));
                    input.set(i + gap, t);
                    swapped = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        List<String> input = Arrays.asList("S O R T E X A M P L E".split(" "));
        System.out.println(input);
        combSort(input);
        System.out.println(input);
    }
}
