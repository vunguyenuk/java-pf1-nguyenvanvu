package Threading;

public class NumberOdd {
    public static class OddThread extends Thread{
        public void run(){
            for(int i = 1; i < 10; i++){
                synchronized (this){
                    if(i % 2 == 1){
                        System.out.println(i);
                        try{
                            Thread.sleep(1000);
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    public static class EvenThread extends Thread{
        public void run(){
            for(int i = 1; i < 10; i++){
                synchronized (this){
                    if(i % 2 == 0){
                        System.out.println(i);
                        try{
                            Thread.sleep(1000);
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread odd = new OddThread();
        Thread thread1 = new Thread(odd);
        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread even = new EvenThread();
        Thread thread2 = new Thread(even);
        thread2.start();
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
