package Stack.RotateElementOfInteger;

import java.util.Scanner;
import java.util.Stack;

public class RotateInteger {
    static Stack<Integer> st= new Stack<>();

    // Function to push digits into stack
    static void push_digits(int number)
    {
        while(number != 0)
        {
            st.push(number % 10);
            number = number / 10;
        }
    }

    // Function to reverse the number
    static int reverse_number(int number)
    {
        // Function call to push number's
        // digits to stack
        push_digits(number);
        int reverse = 0;
        int i = 1;

        // Popping the digits and forming
        // the reversed number
        while (!st.isEmpty())
        {
            reverse = reverse + (st.peek() * i);
            st.pop();
            i = i * 10;
        }

        // Return the reversed number formed
        return reverse;
    }

    // Driver program to test above function
    public static void main(String[] args)
    {
        int number = 123456789;
        System.out.println(reverse_number(number));
    }
}

