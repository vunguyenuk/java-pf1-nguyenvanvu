package OOP;

/*7. Write a time program
The implementation of the selector algorithm
(selection sort) for 100,000 numbers.
Thread: flow or circuit call*/


import java.util.Date;

public class StopWatchTest {
    public static void main(String[] args) {
        StopWatch stopwatch = new StopWatch();

        stopwatch.start();
        System.out.println("The first show time: " + new Date());
        System.out.println("Start measuring at start time: " + stopwatch.getStartTime());
        System.out.println("pause 5s");
        doSomeThing(5);

        stopwatch.stop();
        System.out.println("The last show time: " + new Date());
        System.out.println("pause: " + stopwatch.getEndTime());
        System.out.println("Time past (milisecond): " + stopwatch.getElapsedTime());

        System.out.println("System time at start of measurement: " + new Date(stopwatch.getStartTime()));

    }

    private static void doSomeThing(int s) {
        try {
            Thread.sleep(s * 5000);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
