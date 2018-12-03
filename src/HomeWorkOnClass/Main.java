package HomeWorkOnClass;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random ran = new Random();

        int a[] = new int[50];
        for (int i = 1; i < a.length; i++){
            ran.setSeed(i);//bỏ dòng này đi để thấy sự khác biệt nha
        a[i] = ran.nextInt(100);

        System.out.println(a[i]);
        }
    }
}
