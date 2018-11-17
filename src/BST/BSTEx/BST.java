package BST.BSTEx;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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

    public void inOrderNonRecursion(TreeNode<E> root){
        Stack<TreeNode<E>> stack = new Stack<>();

        if(root == null) return;

        while (true){
             if(root != null){
                stack.push(root);
                root = root.left;
            } else {
                 if(stack.isEmpty()){
                     break;
                 }
                 root = stack.pop();
                 System.out.println(root.element + " ");
                 root = root.right;
             }
        }
    }

    public void breadth(TreeNode<E> root){
        Queue<TreeNode<E>> queue = new LinkedList<>();

        if(root == null){
            return;
        }
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode<E> node = queue.remove(); //lay phan tu giong pop nhung xoa no trong linkedlist
            System.out.println(node.element + " ");
            if(node.left != null) queue.add(node.left);
            if(node.right != null) queue.add(node.right);
        }
    }


    public void inOrder(TreeNode<E> root){
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
        printPostOrder(node.left);

        printPostOrder(node.right);

        System.out.println(node.element + " ");
    }

    public void postOrderNotRecursive(){

    }

    public void printPreOrder(TreeNode<E> node){
        if(node == null){
            return;
        }
        System.out.println(node.element + " ");

        printPreOrder(node.left);

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
            //Case 2: Current has left children
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
