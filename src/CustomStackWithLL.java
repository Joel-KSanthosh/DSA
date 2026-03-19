import java.util.EmptyStackException;

public class CustomStackWithLL<T> {
    public static class StackNode<T> {
        private T data = null;
        private StackNode<T> next = null;

        public StackNode(T data) {
            this.data = data;
        }

    }

    private StackNode<T> top = null;
    private int size = 0;

    public void push(T data) {
        StackNode<T> stack_node = new StackNode<>(data);
        stack_node.next = top;
        top = stack_node;
        size++;
    }

    public T pop() {
        if (top == null)
            throw new EmptyStackException();
        T data = top.data;
        top = top.next;
        size--;
        return data;
    }

    public T peek() {
        if (top == null)
            throw new EmptyStackException();
        return top.data;
    }

    public int size() {
        return size;
    }
}
