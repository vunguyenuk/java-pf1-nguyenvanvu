package BST.BSTEx;

public class TestBST {
    public static void main(String[] args) {
        BST<String> tree = new BST<String>();
        tree.insert("Vu");
        tree.insert("Dung");
        tree.insert("Van");
        tree.insert("Hoa");
        tree.insert("Binh");
        tree.insert("Hop");
        System.out.println("Inorder (sorted): ");
        tree.inOrder();
        System.out.println("\nprePreorder:");
        tree.printPreOrder(tree.root);

        System.out.println("\npostOrder:");
        tree.printPostOrder(tree.root);
        System.out.println("Searching is found " + tree.searchTree("Hop"));
        System.out.println("The number of nodes: " + tree.getSize());

        System.out.println("Status deleted: " + tree.delete("Hop"));
        System.out.println("Inorder again (sorted): ");
        tree.inOrder();
    }
}
