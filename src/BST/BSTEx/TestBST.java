package BST.BSTEx;

public class TestBST {
    public static void main(String[] args) {
       BST<Integer> tree = new BST<Integer>();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(-1);
        tree.insert(-5);

        System.out.println("\ninOrder recursive");
        tree.inOrder(tree.root);

        System.out.println("\ninOrder without recursive: ");
        tree.inOrderNonRecursion(tree.root);

        System.out.println("\npreOrder:");
        tree.printPreOrder(tree.root);

        System.out.println("\npostOrder:");
        tree.printPostOrder(tree.root);

        System.out.println("\nbreadth search: ");
        tree.breadth(tree.root);

    }
}
