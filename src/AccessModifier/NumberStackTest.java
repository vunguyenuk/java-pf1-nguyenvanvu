package AccessModifier;

public class NumberStackTest {
    public static void main(String[] args) {
     NumberStack numberStack = new NumberStack();
     testThat(numberStack.getCount() == 0);
     numberStack.push(1);
     testThat(numberStack.getCount() == 1);
     numberStack.push(2);

     testThat(numberStack.getCount() == 2);
     testThat(numberStack.pop() == 2);
     testThat(numberStack.pop() == 1);
    }
    public static void testThat(boolean condition){
        if(condition){
            System.out.println("success");
        } else {
            System.out.println("failed");
        }
    }
}
