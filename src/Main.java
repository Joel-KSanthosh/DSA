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

        // CustomQueueWithLL<Integer> queue = new CustomQueueWithLL<>();

        // // Mock data
        // queue.insert(10);
        // queue.insert(20);
        // queue.insert(30);

        // System.out.println("Peek: " + queue.peek()); // 10

        // System.out.println("Remove: " + queue.remove()); // 10
        // System.out.println("Remove: " + queue.remove()); // 20

        // System.out.println("Peek after removals: " + queue.peek());

        // TreeNode<String> root = new TreeNode<String>("Root");
        // TreeNode<String> child1 = new TreeNode<String>("Child 1");
        // TreeNode<String> child2 = new TreeNode<String>("Child 2");
        // TreeNode<String> child3 = new TreeNode<String>("Child 3");

        // // Build tree
        // root.addChild(child1);
        // root.addChild(child2);
        // child1.addChild(child3);

        // // Print tree
        // root.printTree(0);

        BST tree = new BST();
        BstNode root = null;

        int[] data = { 50, 30, 70, 20, 40, 60, 80, 10, 35, 45, 65, 90 };

        for (int val : data) {
            root = tree.insert(root, val);
        }

        System.out.print("InOrder Traversal: ");
        tree.inOrder(root);
        System.out.println();

        System.out.print("PreOrder Traversal: ");
        tree.preOrder(root);
        System.out.println();

        System.out.print("PostOrder Traversal: ");
        tree.postOrder(root);
        System.out.println();

        System.out.println("\nSearch 40: " + (tree.search(root, 40) != null));
        System.out.println("Search 99: " + (tree.search(root, 99) != null));

        System.out.println("Min: " + tree.findMin(root).getData());
        System.out.println("Max: " + tree.findMax(root).getData());

    }
}