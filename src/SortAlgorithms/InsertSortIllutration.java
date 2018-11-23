package SortAlgorithms;

import java.util.Scanner;

public class InsertSortIllutration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter element: ");
        for(int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }

        System.out.println("Your input list: ");
        for(int index: array){
            System.out.print("\t" + index);
        }

        inserSort(array);
    }

    public static void inserSort(int[] array){
        boolean isNextPass = true;
        for(int i = 1; i < array.length && isNextPass; i++){
            isNextPass = false;
            int index = i;
            while (index > 0 && array[index - 1] > array[index]){
                //swap
                System.out.println("\nSwap element: " + array[index] + " with " + array[index - 1]);
                int temp = array[index];
                array[index] = array[index - 1];
                array[index - 1] = temp;
                index--;
                isNextPass = true;
            }

            if(isNextPass == false){
                System.out.println("\nArray may be sorted and next pass not needed");
                break;
            }
        }

        System.out.print("Array is sorted: ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

    }
}
