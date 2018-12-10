package Threading;

public class StopThread implements Runnable {
  @Override
  public void run() {
    for(int i = 1; i < 100; i++){
      System.out.println(i);
      try {
        Thread.sleep(100,900);
      } catch (InterruptedException e) {
        System.out.println("Time's up");
        break;
      }
    }
  }

  public static void main(String[] args) {
    Thread t1 = new Thread(new StopThread());
    t1.start();

    try {
      while (!Thread.interrupted()) {
        Thread.sleep(5000);
        t1.interrupt();
      }
    } catch (InterruptedException ex) {
      Thread.currentThread().interrupt();
    }
  }
}
