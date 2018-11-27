package Exception;

import java.util.Random;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {
    public Integer[] createRandom(){
        Random random = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sach phan tu cua mang: ");
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
        System.out.println("\n vui long nhap chi so cua mot phan tu bat ky: ");
        int x = scanner.nextInt();
        try{
            System.out.println("Gia tri cua phan tu co chi so 5: " + x + " la: " + arr[x]);
        } catch (IndexOutOfBoundsException e){
            System.err.println("Chi so vuot qua gioi han");
        }
    }
}
