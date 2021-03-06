package ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MyList<E> implements Cloneable{
    int size = 0;
    static int DEFAULT_CAPACITY = 10;
    int count = 0; //ConcurrentModificationException()
    Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void add(int index, E element){
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("index is invalid");
        }
        ensureCapacity(10);
        System.arraycopy(elements, index, elements, index + 1,size-index);
        elements[index] = element;
        size++;
    }

    public void ensureCapacity(int minCapacity) {
        if(minCapacity > elements.length){
            int newCapacity = (elements.length * 2) + 2;
            if(newCapacity - minCapacity < 0){
                newCapacity = minCapacity;
            }
            if(newCapacity < 0){
                if(minCapacity < 0){
                    throw new OutOfMemoryError("index out of bound");
                }
                newCapacity = Integer.MAX_VALUE;
            }
            elements = Arrays.copyOf(elements, newCapacity);

        }
    }

    public Object remove(int index){
        if (index >= size){
            throw new IndexOutOfBoundsException("Tran bo nho");
        }
        Object oldValue = elements[index];
        int numMoved = size - index - 1;
        if(numMoved > 0){
            System.arraycopy(elements, index + 1, elements, index, numMoved);
        }

        elements[--size] = null;
        return oldValue;
    }

    public int size(){
        return size;
    }

    public Object clone(){
        try{
            MyList<?> v = (MyList<?>) super.clone();
            v.elements = Arrays.copyOf(elements, size);
            v.count = 0;
            return v;
        } catch (Exception e){
            throw new InternalError(e);
        }
    }

    public boolean contains(Object o){
        return indexOf(o) >= 0;
    }

    public int indexOf(Object o) {
        if( o == null){
            for(int i = 0; i < size; i++){
                if(elements[i] == null)
                    return i;
            }
        } else {
            for (int i = 0; i < size; i++){
                if(o.equals(elements[i]))
                    return i;
            }
        }
        return -1;
    }

    public boolean add(E e){
        ensureCapacity(10);
        elements[size++] = e;
        return true;
    }



    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }

        return (E) elements[i];
    }

    public void clear(){
        count++;

        for(int i = 0; i < size; i++){
            elements[i] = null;
        }
        size = 0;
    }

    public void show() {
        for (Object ob : elements) {
            if (ob == null) {
                System.out.println("Chua dien vao");

            } else {
                System.out.println(ob);
            }
        }
    }
}
