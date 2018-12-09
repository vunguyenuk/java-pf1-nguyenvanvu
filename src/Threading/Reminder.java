package Threading;

import java.util.Timer;
import java.util.TimerTask;

public class Reminder {
    private static Timer timer;

    public Reminder(int second){
        timer = new Timer();
        timer.schedule(new ReminderTask(), second * 1000);
    }

    public static class RunNumber extends Thread {
       public void run(){
        for(int i = 1; i < 100; i++){
           System.out.println(i);
           try {
               Thread.sleep(100,900);
           } catch (InterruptedException e) {
               e.printStackTrace();
           } catch (IllegalArgumentException e){
               e.printStackTrace();
           }
         }
       }
    }


    public class ReminderTask extends TimerTask {
        @Override
        public void run() {
            System.out.println("Time's up!");
            timer.cancel();
            System.exit(1);
        }
    }

    public static void main(String[] args){
        RunNumber runNumber = new RunNumber();
        int second = 5;
        runNumber.start();
        new Reminder(second);

    }
}
