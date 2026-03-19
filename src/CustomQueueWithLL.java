import java.util.NoSuchElementException;

public class CustomQueueWithLL<T> {
    public static class QueueNode<T> {
        private T data = null;
        private QueueNode<T> next = null;

        public QueueNode(T data) {
            this.data = data;
        }
    }

    private QueueNode<T> front;
    private QueueNode<T> rear;
    private int size = 0;

    public void insert(T value) {

        QueueNode<T> queueNode = new QueueNode<T>(value);
        if (front == null) {
            front = rear = queueNode;
        } else {
            rear.next = queueNode;
            queueNode.next = null;
            rear = queueNode;
            if (front == null) {
                front = queueNode;
            }
        }
        size++;
    }

    public T remove() {
        if (front == null)
            throw new NoSuchElementException();
        T stack_data = front.data;
        front = front.next;
        size--;
        return stack_data;
    }

    public T peek() {
        if (front == null)
            throw new NoSuchElementException();
        return front.data;
    }
}
