package method;

public class SmallestElementInArray {
    public static void main(String[] args) {
        int[] arr = {22, 5, 4, 6, 7, 2 , 12, 33};
        timMin(arr);

    }

    public static void timMin(int a[]){
        int min = a[0];

        for(int i = 1; i < a.length; i++){
            if(a[i] < min){
                min = a[i];
            }
        }
        System.out.println("min is: " + min);
    }
}
