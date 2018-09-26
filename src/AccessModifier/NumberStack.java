package AccessModifier;

public class NumberStack {
    int numbers[] = new int[10];
    int top;
    int count = 0;
    public NumberStack() {
    }

    public int getCount(){
        return count;
    }

    public void push(int number){
        top = number;
        count++;
    }

    public int pop(){
        int top = numbers[count - 1];
        count--;
        return top;
    }
}
