import java.util.Stack;

public class StackSort {
    public static <T extends Comparable<? super T>> Stack<T> sort(Stack<T> stack) {
        Stack<T> aux = new Stack<T>();
        while(!stack.isEmpty()) {
            T tmp = stack.pop();
            while(!aux.isEmpty() && aux.peek().compareTo(tmp) < 0) {
                stack.push(aux.pop());
            }
            aux.push(tmp);
        }
        return aux;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(3);
        stack.push(12);
        stack.push(17);
        stack.push(10);
        stack.push(4);
        stack.push(18);
        stack.push(8);
        stack.push(7);
        stack.push(1);
        stack.push(15);
        stack.push(16);
        stack.push(14);
        stack.push(20);
        stack.push(13);
        stack.push(2);
        stack.push(19);
        stack.push(9);
        stack.push(11);
        stack.push(6);
        stack.push(5);

        stack = sort(stack);

        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
