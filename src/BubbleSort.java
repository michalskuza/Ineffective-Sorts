import java.util.Arrays;
import java.util.List;

public class BubbleSort {
    public static <T extends Comparable<? super T>> void bubbleSort(List<T> comparable) {
        boolean changed = false;
        do {
            changed = false;
            for (int a = 0; a < comparable.size() - 1; a++) {
                if (comparable.get(a).compareTo(comparable.get(a + 1)) > 0) {
                    T tmp = comparable.get(a);
                    comparable.set(a,comparable.get(a + 1));
                    comparable.set((a + 1), tmp);
                    changed = true;
                }
            }
        } while (changed);
    }

    public static void main(String[] args) {
        List<String> input = Arrays.asList("S O R T E X A M P L E".split(" "));
        printList(input);
        bubbleSort(input);
        printList(input);
    }

    public static <T> void printList(List<T> elements){
        for (T element : elements) {
            System.out.printf("%s ", element);
        }
        System.out.printf("\n");
    }
}
