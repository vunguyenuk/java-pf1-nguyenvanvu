package LinkedList;

import java.util.List;
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

        public Object getData() {
            return this.data;
        }
    }

    public MyLinkedList() {
        this.head = null;
        this.numNodes = 0;
    }

    public void add(int index, Object data) {
        Node node = new Node(data);
      if(index < 0 || index > numNodes){
          throw new IllegalArgumentException("index was out of bounds");
      } else if(head == null){
          head = node;
      } else if(index == 0){
          node.next = head;
          head = node;
      } else {
          Node current = head;
          for(int i = 0; i < index - 1; i++){
              current = current.next;
          }
          node.next = current.next;
          current.next = node;
      }
      numNodes++;
    }

    public boolean add(E e){
        if(head == null || numNodes == 0){
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
        if(head == null || numNodes == 0){
            head = new Node(e);
        } else {
            Node current = head;
            head = new Node(e);
            head.next = current;
        }
        numNodes++;
    }

    public void addLast(E e){
        if(head == null || numNodes == 0) {
            addFirst(e);
        }else{
            Node last = head;
            while (last.next != null) last = last.next;
            last.next = new Node(e);
        }
        numNodes++;
    }

    public E remove(int index){
        if(head == null || numNodes == 0){
            throw new NoSuchElementException("No such Element To remove");
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


    public int size(){
        return numNodes;
    }

    public int indexOf(E e) {
       Node pointer = head;
       if(head == null || numNodes == 0) {
           add(e);
       }
       if(pointer == null){
           throw new IllegalArgumentException("This head is null, not value to get");
       } else {
           for(int i = 0; i < numNodes; i++){
               if(pointer.getData().equals(e)){
                   return i;
               }
               pointer = pointer.next;
           }
       }
       return -1;
    }



    public E get(int index) {
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
        if(head == null || numNodes == 0){
            throw new NoSuchElementException("This list is empty");
        }
        return (E)head.data;
    }

    public E getLast(){
        Node last = head;
        Node nextLast = last.next;
        if(head == null || numNodes == 0){
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

    public boolean remove(E e){
        Node pointer = head;
        if(pointer == null || numNodes == 0) {
            add(e);
        } else {
            for(int i = 0; i < numNodes; i++){
                if(pointer.data.equals(e)){
                    this.remove(i);
                    return true;
                }
            }
        }
        return false;
    }

    public E clone(MyLinkedList<E> list){
        Node current = head;
        if(current == null || numNodes == 0){
            throw new NoSuchElementException("Danh sach rong");
        }else{
            for(int i = 0; i < numNodes; i++){
                list.addLast((E) current.data);
                current = current.next;
            }
        }
        return (E)list;
    }

    public boolean contains(E o){
        Node current = head;

        if(current == null || numNodes == 0){
            return false;
        }else {
            for(int i = 0; i < numNodes; i++){
                if(current.getData().equals(o)){
                    return true;
                }
                current = current.next;
            }
        }
        return false;
    }
    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}