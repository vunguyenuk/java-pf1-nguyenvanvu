package Stack.QueueLinkedList;

public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue myLinkedListQueue = new MyLinkedListQueue();
        myLinkedListQueue.enqueue(11);
        myLinkedListQueue.enqueue(22);
        myLinkedListQueue.enqueue(33);
        myLinkedListQueue.dequeue();
        System.out.println("Dequeue item is: " + myLinkedListQueue.dequeue().key);
    }
}
