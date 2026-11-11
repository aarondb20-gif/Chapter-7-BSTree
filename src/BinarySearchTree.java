import org.w3c.dom.Node;

public class BinarySearchTree<T extends Comparable<T>> {
    protected BSTNode<T> root;

    public BinarySearchTree() {
        root = null;

    }


    static class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    public void add(T element) {
        root = recAdd(element, root);
    }

    //Recursively add elements to tree
    private BSTNode<T> recAdd(T element, BSTNode<T> node) {
        if (node == null) {
            return new BSTNode<>(element);
        }else if (element.compareTo(node.getInfo()) <= 0) {
            node.setLeft(recAdd(element, node.getLeft()));
            //find duplicate
        //}else if(element.compareTo(node.getInfo()) == 0){
          //  return null;
        } else {
            node.setRight(recAdd(element, node.getRight()));
        }
        return node;
    }

    public int height() {
        return recHeight(root);
    }

    //Recursive Tree Height
    private int recHeight(BSTNode<T> node) {
        if (node == null) {
            return -1;
        } else {
            return 1 + Math.max(recHeight(node.getLeft()), recHeight(node.getRight()));
        }
    }

    //Inorder Traversal
    public boolean inOrderTraversal() {
        if (root == null) {
            System.out.println("Tree is empty.");
            return false;
        }
        recInOrder(root);
        System.out.println("Inorder:");
        return true;

    }

    private void recInOrder(BSTNode<T> current) {
        if (current == null) {
            return;
        }
        recInOrder(current.getLeft());
        System.out.println(current.getInfo());
        recInOrder(current.getRight());
    }

    // Iterative Min Finder
    private T findMinHelper(BSTNode<T> current){
        while (current.getLeft() != null) {
            current = current.getLeft();
        }
        return current.getInfo();
    }
    public T findmin(){
        if(root == null){
            return null;
        }
        return findMinHelper(root);
    }


    //Preorder Traversal

    public boolean preOrderTraversal() {
        if (root == null) {
            System.out.println("Tree is empty.");
            return false;
        }
        recPreOrder(root);
        System.out.println("Preorder:");
        return true;

    }

    private void recPreOrder(BSTNode<T> current) {
        if (current == null) {
            return;
        }
        System.out.println(current.getInfo());
        recPreOrder(current.getLeft());
        recPreOrder(current.getRight());
    }
}
