package Stack;

import java.util.Stack;

public class BlancedBracket {

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
            Stack stack = new Stack();

            for(int i = 0 ; i < exp.length; i++) {
                if (exp[i] == '{' || exp[i] == '(' || exp[i] == '[')
                    stack.push(exp[i]);

                if (exp[i] == '}' || exp[i] == ')' || exp[i] == ']') {
                    if (stack.isEmpty()) {
                        return false;
                    }

                    else if ( !isMatchingPair((Character) stack.pop(), exp[i]) ) {
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

