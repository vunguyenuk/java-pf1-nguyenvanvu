package Stack.MyQueueBasic;

public class QueueClient {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue(5);
        myQueue.enqueue(1);
        myQueue.enqueue(23);
        myQueue.enqueue(33);
        myQueue.firstDequeue();
        myQueue.lastDequeue();
    }
}
