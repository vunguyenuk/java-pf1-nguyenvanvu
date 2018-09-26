package OOP;

import java.util.Random;

public class RandomInt {
    public int seed;

    RandomInt(int seed){
        this.seed = seed;
    }

    public int getRandomInt() {
        Random random = new Random();

        int[] a = new int[50];
        if(seed == 1000){
            for (int i = 0; i < a.length; i++) {
                random.setSeed(i);
                a[i] = random.nextInt(100);
                System.out.println("so ngau nhien tu " + i + " den " + a.length + " la: " + a[i]);
            }
        }

        System.out.print("seed hien tai co do dai la: ");
        return seed;
    }
}
