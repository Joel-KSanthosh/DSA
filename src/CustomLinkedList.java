class Node<T> {
    T value;
    Node<T> next;

    public Node(T value) {
        this.value = value;
        this.next = null;
    }
}

public class CustomLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public CustomLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void insertAtBeginning(T value) {
        Node<T> newNode = new Node<>(value);
        newNode.next = head;
        head = newNode;

        if (size == 0) {
            tail = newNode;
        }

        size++;
    }

    public void insertAtEnd(T value) {
        Node<T> newNode = new Node<>(value);
        tail.next = newNode;
        tail = newNode;

        if (size == 0) {
            head = newNode;
        }

        size++;
    }

    public T removeAtBeginning() {
        if (head == null) {
            throw new IndexOutOfBoundsException("Unable to delete linked list is empty");
        }
        T deletedValue = head.value;
        head = head.next;

        if (head == null) {
            tail = null;
        }
        size--;
        return deletedValue;
    }

    public T removeAtEnd() {
        if (tail == null) {
            throw new IndexOutOfBoundsException("Unable to delete linked list is empty");
        }
        Node<T> current = head;
        T deletedValue = tail.value;
        for (int i = 0; i < size - 1; i++) {
            current = current.next;
        }
        current.next = null;
        tail = current;
        size--;
        return deletedValue;
    }

    public void displayElements() {
        Node<T> current = head;
        System.out.print("head --> ");
        for (int i = 0; i < size; i++) {
            System.out.print(current.value + " --> ");
            current = current.next;
        }
        System.out.println("end");
    }
}
