package Threading;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimeClock extends TimerTask {

    @Override
    public void run() {
        System.out.println("Timer task started at:"+new Date());
        completeTask();
        System.out.println("Timer task finished at:"+new Date());
    }

    private void completeTask(){
        try{
            Thread.sleep(20000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TimerTask timerTask = new TimeClock();

        Timer timer = new Timer(true);
        timer.scheduleAtFixedRate(timerTask, 0, 10* 1000);
        System.out.println("TimerTask started");
        //cancel after sometime

        try{
            Thread.sleep(120000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        timer.cancel();
        System.out.println("TimerTask cancelled");
        try{
            Thread.sleep(30000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
