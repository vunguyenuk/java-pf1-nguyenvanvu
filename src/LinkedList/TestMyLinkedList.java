package LinkedList;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();

        myLinkedList.add(0,9);
        myLinkedList.add(1,19);

        myLinkedList.add(2,21);
        myLinkedList.add(3,22);

        myLinkedList.addFirst(10);
        myLinkedList.addLast(11);
        System.out.println("Get First: " + myLinkedList.getFirst());
        System.out.println("Get Last: " + myLinkedList.getLast());

        myLinkedList.printList();
    }
}