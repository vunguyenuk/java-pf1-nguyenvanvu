package BST.BSTEx;

public class BST<E extends Comparable<E>> extends AbstractTree<E>{
    protected TreeNode<E> root;
    protected int size = 0;

    public BST(E[] objects){
        for(int i = 0; i < objects.length; i++){
            insert(objects[i]);
        }
    }


    public BST() {

    }

    @Override
    public boolean insert(E e) {
        if(root == null){
            root = createNewNode(e);
        }else{
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null) {
                if(e.compareTo(current.element) < 0){
                    parent = current;
                    current = current.left;
                }else if(e.compareTo(current.element) > 0){
                    parent = current;
                    current = current.right;
                }else {
                    return false;
                }
            }
            if(e.compareTo(parent.element) < 0){
                parent.left = createNewNode(e);
            }else {
                parent.right = createNewNode(e);
            }
        }
        size++;
        return true;
    }

    private TreeNode<E> createNewNode(E e) {
        return new TreeNode<>(e);
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void inOrder() {
        inOrder(root);
    }

    protected void inOrder(TreeNode<E> root){
        if(root == null) return;
        inOrder(root.left);
        System.out.println(root.element + " ");
        inOrder(root.right);
    }

    public boolean searchTree(E e){
        TreeNode<E> current = root;
        while (current != null){
            if(e.compareTo(current.element) < 0){
                current = current.left;
            }else if(e.compareTo(current.element) > 0){
                current = current.right;
            }else {
                return true;
            }
        }
        return false;
    }

    public void printPostOrder(TreeNode<E> node){
        if(node == null){
            return;
        }
        //Duyet sang trai
        printPostOrder(node.left);

        //Duyet sang phai
        printPostOrder(node.right);

        System.out.println(node.element + " ");
    }

    public void printPreOrder(TreeNode<E> node){
        if(node == null){
            return;
        }
        System.out.println(node.element + " ");

        //Duyet sang trai
        printPreOrder(node.left);

        //Duyet sang phai
        printPreOrder(node.right);
    }

    public boolean delete(E e){
        TreeNode<E> parent = null;
        TreeNode<E> current = root;

        while (current != null) {
            if (e.compareTo(current.element) < 0) {
                parent = current;
                current = current.left;
            } else if (e.compareTo(current.element) > 0) {
                parent = current;
                current = current.right;
            }
            else
            break; // Element is in the tree pointed by current
        }

        if(current == null){
            return false;
        }
        //Case 1: Current has no left children
        if(current.left == null){
            if(parent == null){
                root = current.right;
            } else {
                if(e.compareTo(parent.element) < 0){
                    parent.left = current.right;
                } else {
                    parent.right = current.right;
                }
            }
        } else {
            //Case 2
            TreeNode<E> parentOfRightMost = current;
            TreeNode<E> rightMost = current.left;

            while (rightMost.right != null){
                parentOfRightMost = rightMost;
                rightMost = rightMost.right;
            }

            current.element = rightMost.element;

            if(parentOfRightMost.right == rightMost){
                parentOfRightMost.right = rightMost.left;
            }else {
                parentOfRightMost.left = rightMost.left;
            }
        }
        size--;
        return true;
    }
}
