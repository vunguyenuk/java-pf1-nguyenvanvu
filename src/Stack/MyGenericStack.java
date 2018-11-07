package Stack;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<E> {
    private LinkedList<E> stack;

    public MyGenericStack() {
        stack = new LinkedList();
    }

    public void push(E e){
        stack.addFirst(e);
    }

    public E pop(){
        if(stack.isEmpty()){
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public int size(){
        return stack.size();
    }

    public boolean isEmpty(){
        if(size() == 0){
            return true;
        }
        return false;
    }
}
