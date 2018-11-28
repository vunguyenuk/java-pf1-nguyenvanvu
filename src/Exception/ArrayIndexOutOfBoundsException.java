package Exception;

import java.util.Random;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {
    public Integer[] createRandom(){
        Random random = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("List of element is: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(100);
            System.out.println(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsException arrayIndexBound = new ArrayIndexOutOfBoundsException();
        Integer[] arr = arrayIndexBound.createRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Please Enter any number: ");
        int x = scanner.nextInt();
        try{
            System.out.println("Value of element has index 5: " + x + " is: " + arr[x]);
        } catch (IndexOutOfBoundsException e){
            System.err.println("Index out of bounds");
        }
    }
}
