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
                System.out.println("random's number " + i + " to " + a.length + " is: " + a[i]);
            }
        }

        System.out.print("seed's length: ");
        return seed;
    }
}
