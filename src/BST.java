class BstNode {
    private int data;
    private BstNode left;
    private BstNode right;

    public BstNode(int data) {
        this.data = data;
    }

    public int getData() {
        return this.data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setRight(BstNode node) {
        this.right = node;
    }

    public void setLeft(BstNode node) {
        this.left = node;
    }

    public BstNode getRight() {
        return this.right;
    }

    public BstNode getLeft() {
        return this.left;
    }
}

public class BST {
    public BstNode insert(BstNode node, int data) {
        BstNode child = new BstNode(data);
        if (node == null) {
            node = child;
        } else {
            if (data > node.getData()) {
                node.setRight(insert(node.getRight(), data));
            } else if (data < node.getData()) {
                node.setLeft(insert(node.getLeft(), data));
            }
        }
        return node;
    }

    public BstNode search(BstNode node, int data) {
        if (node == null) {
            return null;
        }
        while (node != null) {
            if (data == node.getData()) {
                return node;
            } else if (data > node.getData()) {
                node = node.getRight();
            } else {
                node = node.getLeft();
            }
        }
        return null;
    }

    public BstNode findMin(BstNode root) {
        if (root == null) {
            return null;
        }
        while (root.getLeft() != null) {
            root = root.getLeft();
        }
        return root;
    }

    public BstNode findMax(BstNode root) {
        if (root == null) {
            return null;
        }
        while (root.getRight() != null) {
            root = root.getRight();
        }
        return root;
    }

    public void inOrder(BstNode root) {
        if (root != null) {
            inOrder(root.getLeft());
            System.out.print(root.getData() + " ");
            inOrder(root.getRight());
        }
    }

    public void preOrder(BstNode root) {
        if (root != null) {
            System.out.print(root.getData() + " ");
            preOrder(root.getLeft());
            preOrder(root.getRight());
        }
    }

    public void postOrder(BstNode root) {
        if (root != null) {
            postOrder(root.getLeft());
            postOrder(root.getRight());
            System.out.print(root.getData() + " ");
        }
    }
}
