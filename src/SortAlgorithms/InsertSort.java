package SortAlgorithms;

/*
* Step 1:
* */
public class InsertSort {
    public static void main(String[] args) {
        int[] array = {7, 2, 1, 11, 4, 5, 9, 23, 46, 32, 58};
        sort(array);


        for(int i = 0; i < array.length; i++){
            System.out.println("Array is sorted: " + array[i]);
        }
    }

    public static void sort(int[] array){
        for(int i = 0; i < array.length; i++){
            int index = i;
            while (index > 0 && array[index - 1] > array[index]){
                //swap
                System.out.println("Swap: " + array[index] + " with " + array[index - 1]);
                int temp = array[index];
                array[index] = array[index - 1];
                array[index - 1] = temp;
                index--;
            }
        }
    }
}
