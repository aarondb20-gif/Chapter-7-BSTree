import java.net.StandardSocketOptions;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree<Integer> archive = new BinarySearchTree<>();
        int[] sampleIds = {50,25,75,10,30,60,85};
        for (int id : sampleIds){
            archive.add(id);
        }
        //Tree height
        //System.out.println(archive.height());
        //Inorder
        System.out.println(archive.inOrderTraversal());
        //Preorder
        System.out.println(archive.preOrderTraversal());


    }
}
