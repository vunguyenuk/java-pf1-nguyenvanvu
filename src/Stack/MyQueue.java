package Stack;

public class MyQueue {
    private int capacity;
    private int queueArr[];
    private int head = 0;
    private int tail = -1;
    private int currentSize = 0;

    public MyQueue(int currentSize) {
        this.capacity = currentSize;
        queueArr = new int[currentSize];
    }

    public boolean isQueueFull(){
        boolean status = false;
        if(currentSize == capacity){
            status = true;
        }
        return status;
    }

    public boolean isQueueEmpty(){
        boolean status = false;
        if(currentSize == 0){
            status = true;
        }
        return status;
    }

    public void enqueue(int item){
        if(isQueueFull()){
            System.out.println("Overflow ! Unable to add element: " + item);
        }else{
            tail++;
            if(tail == capacity - 1){
                tail = 0;
            }
            queueArr[tail] = item;
            currentSize++;
            System.out.println("Element: " + item + " is pushed to stack");
        }
    }

    public void firstDequeue(){
        if(isQueueEmpty()){
            System.out.println("Underflow ! Unable to remove element from Queue");
        } else {
            head++;
            if(head == capacity - 1){
                head = 0;
                System.out.println("Pop operation remove " + queueArr[head-1]);
            }else{
                System.out.println("Pop operation remove " + queueArr[head-1]);
            }
        }

    }

    public void lastDequeue(){
        if(isQueueEmpty()){
            System.out.println("Underflow ! Unable to remove element from Queue");
        } else {
            tail++;
            if(tail == capacity - 1){
                tail = 0;
                System.out.println("Pop operation remove " + queueArr[tail-1]);
            }else{
                System.out.println("Pop operation remove " + queueArr[tail-1]);
            }
        }

    }
}
