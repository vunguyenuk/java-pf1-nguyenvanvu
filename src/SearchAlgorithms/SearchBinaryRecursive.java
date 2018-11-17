package SearchAlgorithms;

public class SearchBinaryRecursive {
    public static int[] list = {1, 3, 4, 6, 12, 23, 43, 54, 65, 78, 81, 92, 193};


    public static int recursiveSearch(int[] list, int low, int high, int value) {
        if (high >= low) {
            int mid = (high + low) / 2;
            if(list[mid] == value){
                return mid;
            }else if(list[mid] > value){
                return recursiveSearch(list, low, mid-1, value);
            }else{
                return recursiveSearch(list,mid + 1,high, value);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("so 43 o vi tri: " + recursiveSearch(list,0,list.length - 1,483));
        System.out.println("so 1 o vi tri: " + recursiveSearch(list,0,list.length - 1,1));
        System.out.println("so 3 o vi tri: " + recursiveSearch(list,0,list.length - 1,3));
        System.out.println("so 193 o vi tri: " + recursiveSearch(list,0,list.length - 1,193));
        System.out.println("so 54 o vi tri: " + recursiveSearch(list,0,list.length - 1,54));
    }
}
