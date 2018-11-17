package SearchAlgorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class LongestIncreasing {
    public static int bsearch(char[] arr, int size, int key)
    {
        int left = 0;
        int right = size - 1;
        int mid;
        while (left <= right)
        {
            mid = (left + right) / 2;
            if(arr[mid] < key)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return left;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String userString = input.next();


        char[] maxArr = new char[userString.length()];
        char[] precedent = new char[userString.length()];
        maxArr[0] = userString.charAt(0);
        precedent[0] = userString.charAt(0);
        int len = 1;
        for(int i = 1; i < userString.length(); i++)
        {
            if(userString.charAt(i) > maxArr[len - 1])
            {
                maxArr[len] = userString.charAt(i);
                precedent[len] = userString.charAt(i);
                len++;
            }
            else
                maxArr[bsearch(maxArr, len, userString.charAt(i))] = userString.charAt(i);
        }

        //System.out.println(len);
        for(int i = 0; i < len; i++)
            System.out.print(precedent[i]);

    }
}
