import java.util.ArrayList;
import java.util.List;

public class TreeNode<T> {
    private T data;
    private List<TreeNode<T>> childrens;

    public TreeNode(T data) {
        this.data = data;
        this.childrens = new ArrayList<>();
    }

    public void addChild(TreeNode<T> childdNode) {
        this.childrens.add(childdNode);
    }

    public void printTree(int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("  ");
        }
        System.out.println(data);

        for (TreeNode<T> child : childrens) {
            child.printTree(level + 1);
        }
    }
}