public class SumOfElementInArray {
    public static void main(String[] args) {
        int[] num = { 5, 2, 3, 7, 14 };
        int sum , count = 0, value = 8;

        for(int i = 0; i < num.length; i++){
            for(int j = i + 1; j < num.length; j++){
                if( num[i] < value && value > num[j] && num[i] != 0 || num[j] != 0){
                    count++;
                }
                sum = num[i] + num[j];
                if(sum == value){
                    System.out.println("giá trị " + value + " có số lần lặp " + count + " trên tổng hai số là: " + num[i] + " + " + num[j]);
                }
            }
        }
    }
}
