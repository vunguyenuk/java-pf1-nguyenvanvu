package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReplaceElementArray {
    public static void main(String[] args) {
        int[] arrayA = new int[3];
        int[] arrayB = new int[arrayA.length];


        Scanner sc = new Scanner(System.in);

        int length = arrayA.length;
        
        for(int i = 0; i < length; i++ ){
            System.out.println("Nhap cac phan tu thu "+ i + " cho mang: ");
            arrayA[i] = sc.nextInt();

//            copy arrayA to arrayB
            arrayB[i] = arrayA[i];
        }
        System.out.println("phan tu arrayB:  " + Arrays.toString(arrayB));

        int lengthB = arrayB.length;
        int[] arrayC = new int[arrayB.length];
        for(int i = 0; i < lengthB; i++){
            arrayC[i] = arrayB[i];
        }
        System.out.println("phan tu arrayC:  " + Arrays.toString(arrayC));
    }
}
