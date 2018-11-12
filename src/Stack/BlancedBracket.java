package Stack;

public class BlancedBracket {

      public static class stack {
            int top=-1;
            char items[] = new char[100];

           public void push(char x) {
                if (top == 99) {
                    System.out.println("Stack full");
                }
                else {
                    items[++top] = x;
                }
            }

            public char pop() {
                if (top == -1) {
                    System.out.println("Underflow error");
                    return '\0';
                }
                else {
                    char element = items[top];
                    top--;
                    return element;
                }
            }

            public boolean isEmpty()
            {
                return (top == -1) ? true : false;
            }
        }

        static boolean isMatchingPair(char character1, char character2) {
            if (character1 == '(' && character2 == ')')
                return true;
            else if (character1 == '{' && character2 == '}')
                return true;
            else if (character1 == '[' && character2 == ']')
                return true;
            else
                return false;
        }


       public static boolean areParenthesisBalanced(char exp[]) {
            stack stack = new stack();

            for(int i = 0 ; i < exp.length; i++) {
                if (exp[i] == '{' || exp[i] == '(' || exp[i] == '[')
                    stack.push(exp[i]);

                if (exp[i] == '}' || exp[i] == ')' || exp[i] == ']') {
                    if (stack.isEmpty()) {
                        return false;
                    }

                    else if ( !isMatchingPair(stack.pop(), exp[i]) ) {
                        return false;
                    }
                }
            }

            if (stack.isEmpty())
                return true; /*balanced*/
            else {   /*not balanced*/
                return false;
            }
        }

   
        public static void main(String[] args) {
            char exp[] = "s * (s – a) * (s – b) * (s – c)".toCharArray();
            if (areParenthesisBalanced(exp))
                System.out.println("Balanced ");
            else
                System.out.println("Not Balanced ");
        }

}

