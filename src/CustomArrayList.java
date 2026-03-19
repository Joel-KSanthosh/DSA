import java.util.Arrays;

public class CustomArrayList<T> {
    private T[] array;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    @SuppressWarnings("unchecked")
    public CustomArrayList() {
        array = (T[]) new Object[INITIAL_CAPACITY];
        size = 0;
    }

    @SuppressWarnings("unchecked")
    public CustomArrayList(int length) {
        array = (T[]) new Object[length];
        size = 0;
    }

    public void resizeArray() {
        int newCapacity = array.length * 2;
        array = Arrays.copyOf(array, newCapacity);
    }

    public void add(T element) {
        if (size == array.length) {
            resizeArray();
        } else {
            array[size++] = element;
        }
    }

    public T remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        T removedElement = (T) array[index];

        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size - 1] = null;
        size--;
        return removedElement;
    }

    public T get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return array[index];
    }

    public int size() {
        return size;
    }
}