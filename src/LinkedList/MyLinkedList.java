package LinkedList;

import java.util.NoSuchElementException;

public class MyLinkedList<E>{
    private  Node head;
    private  int numNodes;

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
            this.next = null;
        }
        public Node(Object data, Node next){
            this.data = data;
            this.next = next;
        }

        public Object getData() {
            return this.data;
        }
    }

    public MyLinkedList() {
        this.head = null;
        this.numNodes = 0;
    }

    public void add(int index, Object data) {
      if(index < 0 || index > numNodes){
          throw new IllegalArgumentException("index was out of bounds");
      } else if(index > 0 && head == null){
          throw new IllegalArgumentException("next index is null please enter");
      } else if(index == 0){
          head = new Node(data, head);
      } else {
          Node current = head;
          for(int i = 0; i < index - 1; i++){
              current = current.next;
          }
          current.next = new Node(data, current.next);
      }
      numNodes++;
    }

    public boolean add(E e){
        if(head == null){
            head = new Node(e);
        }else{
            Node node = head;
            //loop until the last node
            for(; node.next != null; node = node.next){}
            node.next = new Node(e);
        }
        numNodes++;
        return true;
    }

    public void addFirst(E e) {
        if(e == null){
            throw new NullPointerException();
        } else {
            Node current = head;
            head = new Node(e);
            head.next = current;
            numNodes++;
        }
    }

    public void addLast(E e){
        if(e == null){
            throw new NullPointerException();
        }
        if(head == null) {
            addFirst(e);
        }else{
            Node last = head;
            while (last.next != null) last = last.next;
            last.next = new Node(e);
            numNodes++;
        }
    }

    public E remove(int index){
        if(head == null){
            throw new NoSuchElementException();
        }
        if(index < 0 || index >= numNodes){
            throw new IndexOutOfBoundsException("out of rank");
        }
        if(index == 0){
            E element = (E)head.data;
            head = head.next;
            return element;
        }else{
            Node current = head;
            for(int i = 0; i < index - 1; i++){
                current = current.next;
            }
            E element = (E)current.next.data;
            current.next = current.next.next;
            return element;
        }
    }

    public boolean remove(E e){
        int index = indexOf(e);
        if(index != -1){
            remove(index);
            return true;
        } else {
            return false;
        }
    }

    public int size(){
        return numNodes;
    }

    private int indexOf(E e) {
        int index = -1;
        for(int i = 0; i < size(); i++){
            E currentElement = get(i);
            if(e == null){
                if(currentElement == null){
                    index = i;
                    break;
                }
            } else {
                if(currentElement != null && currentElement.equals(e)){
                    index = i;
                    break;
                }
            }
        }
        return index;
    }

    private E get(int index) {
        if(index < 0 || index >= numNodes){
            throw new IndexOutOfBoundsException("out of rank");
        }
        Node node = head;
        for(int i = 0; i < index; i++){
            node = node.next;
        }
        return (E) node.data;
    }

    public E getFirst(){
        if(numNodes == 0){
            throw new NoSuchElementException("This list is empty");
        }
        return (E)head.data;
    }

    public E getLast(){
        Node last = head;
        Node nextLast = last.next;
        if(numNodes == 0){
            throw new NoSuchElementException("This list is empty");
        }else{
            while (nextLast != null){
                last = nextLast;
                nextLast = last.next;
            }
            return (E)last.data;
        }
    }

    public void clear(){
        head = null;
        numNodes = 0;
    }

    public boolean contains(E e){
        return indexOf(e) != -1;
    }

    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}