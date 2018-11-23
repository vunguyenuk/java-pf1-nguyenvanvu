package SortAlgorithms;

import java.util.Scanner;

public class BubbleSortIllustration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of list: ");
        int size = scanner.nextInt();
        int[] list = new int[size];

        System.out.println("Enter: " + list.length + " values: ");
        for(int i = 0; i < list.length; i++){
            list[i] = scanner.nextInt();
        }
        System.out.println("Your input list: ");
        for(int i = 0; i < list.length; i++ ){
            System.out.println(list[i] + "\t");
        }

        System.out.println("\n Begin sort processing...");
        bubbleSortByStep(list);
    }

    public static void bubbleSortByStep(int[] list){
        boolean needNextPass = true;

        for(int i = 0; i < list.length && needNextPass; i++){
            needNextPass = false;
            for(int j = 0; j < list.length - i; j++){
                if(list[i] > list[i+1]){
                    System.out.println("Swap: " + list[i] + " with " + list[i + 1]);
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needNextPass = true;
                }
            }

            if(needNextPass == false){
                System.out.println("Array may be sorted and next pass not needed");
                break;
            }

            System.out.println("List after the " + i + " sort: ");
            for(int j = 0; j < list.length; j++){
                System.out.println(list[j] + "\t");
            }
            System.out.println();
        }
    }
}
