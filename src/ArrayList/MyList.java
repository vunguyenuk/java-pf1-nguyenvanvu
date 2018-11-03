package ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MyList<E> {
    int size = 0;
    static int DEFAULT_CAPACITY = 10;
    int count = 0;
    Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void add(int index, E element){
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("index khong hop le");
        }
        ensureCapacity();
        System.arraycopy(elements, index, elements, index + 1,size-index);
        elements[index] = element;
        size++;
    }

    public void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public Object remove(int index){
        if (index >= size){
            throw new IndexOutOfBoundsException("Tran bo nho");
        }
        count++;
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
        ensureCapacity();
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
}
