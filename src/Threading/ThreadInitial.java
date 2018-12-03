package Threading;

public class ThreadInitial{
    public static class MyThread implements Runnable {
        @Override
        public void run() {
            int number = 10;
            for(int i = 0 ; i < number; i++){
                System.out.println(i);
                try {
                    Thread.sleep(500);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Runnable myThread = new MyThread();
        Thread thread1 = new Thread(myThread);
        Thread thread2 = new Thread(myThread);

        thread1.setPriority(1);
        thread1.join();
        thread2.setPriority(10);
        thread2.join();
        thread2.start();
    }

}
