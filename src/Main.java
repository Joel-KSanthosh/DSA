public class Main {
    public static void main(String[] args) {

        // CustomLinkedList<Integer> list = new CustomLinkedList<>();

        // // Insert at beginning
        // list.insertAtBeginning(10);
        // list.insertAtBeginning(20);
        // list.insertAtBeginning(30);

        // // Insert at end
        // list.insertAtEnd(40);
        // list.insertAtEnd(50);

        // list.displayElements();

        // // Remove at beginning
        // System.out.println("Removed from beginning: " + list.removeAtBeginning());

        // // Remove at end
        // System.out.println("Removed from end: " + list.removeAtEnd());
        // list.displayElements();

        // CustomStackWithLL<Integer> stack = new CustomStackWithLL<>();

        // // Mock data
        // stack.push(10);
        // stack.push(20);
        // stack.push(30);

        // System.out.println("Size after pushes: " + stack.size()); // 3

        // System.out.println("Peek: " + stack.peek()); // 30

        // System.out.println("Pop: " + stack.pop()); // 30
        // System.out.println("Pop: " + stack.pop()); // 20

        // System.out.println("Size after pops: " + stack.size()); // 1

        // System.out.println("Peek: " + stack.peek()); //

        CustomQueueWithLL<Integer> queue = new CustomQueueWithLL<>();

        // Mock data
        queue.insert(10);
        queue.insert(20);
        queue.insert(30);

        System.out.println("Peek: " + queue.peek()); // 10

        System.out.println("Remove: " + queue.remove()); // 10
        System.out.println("Remove: " + queue.remove()); // 20

        System.out.println("Peek after removals: " + queue.peek());

    }
}