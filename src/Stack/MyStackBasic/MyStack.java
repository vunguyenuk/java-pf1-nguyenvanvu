package Stack.MyStackBasic;

public class MyStack {
    int size;
    int[] arr;
    int index = 0;

    public MyStack(int size) {
        this.size = size;
        arr = new int[size];
    }

    public void push(int element){
        if(isFull()){
            throw new StackOverflowError("stack is full");
        }
        arr[index] = element;
        index++;
    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("stack is null");
        }
        return arr[--index];
    }

    public boolean isEmpty() {
        if (index == 0){
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if(index == size){
            return true;
        }
        return false;
    }

    public int size() {
        return size;
    }
}
