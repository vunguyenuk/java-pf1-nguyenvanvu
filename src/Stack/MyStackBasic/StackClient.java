package Stack.MyStackBasic;

public class StackClient {
    public static void main(String[] args) throws Exception {
        MyStack myStack = new MyStack(10);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        System.out.println("1. Size of stack after push operations: " + myStack.size());
        System.out.print("2. Pop elements from stack : \t");
        while (!myStack.isEmpty()){
            System.out.println(myStack.pop());

        }
        System.out.println("\n3. Size of stack after pop operations : " + myStack.size());
    }
}
