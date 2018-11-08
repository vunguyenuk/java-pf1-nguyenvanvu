package Stack.GenericStack;

public class GenericStackClient {
    public static void StackOfString(){
        MyGenericStack<String> myGenericStack = new MyGenericStack();
        myGenericStack.push("Vu");
        myGenericStack.push("Van");
        myGenericStack.push("Sang");

        System.out.println("size: " + myGenericStack.size());
        System.out.println("list of generic string: ");
        while (!myGenericStack.isEmpty()){
            System.out.println(myGenericStack.pop() + " ");
        }
    }

    public static void StackOfInteger() {
        MyGenericStack <Integer> myGenericStack = new MyGenericStack();
        myGenericStack.push(1);
        myGenericStack.push(22);
        myGenericStack.push(32);
        myGenericStack.push(42);
        while (!myGenericStack.isEmpty()){
            System.out.println(myGenericStack.pop() + " ");
        }
    }
    public static void main(String[] args) {
        System.out.println("1. Stack of string:");
        StackOfString();
        System.out.println("2. Stack of integer: ");
        StackOfInteger();
    }
}
