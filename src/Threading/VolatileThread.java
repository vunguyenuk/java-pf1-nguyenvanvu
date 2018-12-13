package Threading;

import java.util.Random;

public class VolatileThread extends Thread{
  private volatile boolean keepRunning = true;

  public void run() {
    Random random = new Random();
    System.out.println("Thread started");

    int i = 1;
    while (keepRunning) {
      try {
        if(i < 100){
          System.out.println(i);
          i++;
          Thread.sleep(random.nextInt(800) + 100);
        }
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    System.out.println("Thread stopped");
  }

  public void stopThread() {
    this.keepRunning = false;
  }

  public static void main(String[] args) throws Exception{
    VolatileThread v = new VolatileThread();
    v.start();
    Thread.sleep(5000);
    v.stopThread();
  }
}
