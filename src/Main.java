import java.net.StandardSocketOptions;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree<Integer> archive = new BinarySearchTree<>();
        int[] sampleIds = {10,20,30,20,40};
        for (int id : sampleIds){
            archive.add(id);
        }
        int[] test0 = {};
        int[] test1 = {10};
        int[] test2 = {10,20,30,40};
        //Tree height
        System.out.println("Tree Height: " + archive.height());
        //Inorder
        System.out.println(archive.inOrderTraversal());
        //Preorder
        System.out.println(archive.preOrderTraversal());


    }
}
