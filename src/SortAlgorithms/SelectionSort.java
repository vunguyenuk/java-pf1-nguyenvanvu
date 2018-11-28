package SortAlgorithms;

public class SelectionSort {
    static int[] list = {1, 9, 4, 6, 5, 0, -4, -5, 2};
    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int min = list[i]; // Save the smallest element
            int index = i; // Save the index of smallest element

            for (int j = i + 1; j < list.length; j++) {
                if (min > list[j]) {
                    min = list[j];
                    index = j;
                }
            }

            // If the index has changed, we will permute
            if (index != i) {
                int temp = list[i];
                list[i] = list[index];
                list[index] = temp;
            }
        }
    }

    public static void main(String[] args) {
        selectionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
