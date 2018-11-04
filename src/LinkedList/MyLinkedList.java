package LinkedList;

public class MyLinkedList {
    private Node head;
    private int numNodes;

    public MyLinkedList(Object object){
        this.head = new Node(object);
    }

    private class Node{
        private Node next;
        private Object object;

        public Node(Object object) {
            this.object = object;
        }

        public Object getObject(){
            return this.object;
        }
    }

    public void add(int index, Object object){
        Node temp = head;
        Node holder;

        for(int i = 0; i < index-1 && temp.next != null; i++){
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(object);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(Object object){
        Node temp = head;
        head = new Node(object);
        head.next = temp;
        numNodes++;
    }

    public Node get(int index){
        Node temp = head;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp;
    }

    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.println("danh sach node");
            temp = temp.next;
        }
    }
}
