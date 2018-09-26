package OOP;

/*7. Viết chương trình đo thời gian
thực thi của thuật toán sắp xếp chọn
(selection sort) cho 100,000 số.
Thread: luồng hay gọi là mạch*/


import java.util.Date;

public class StopWatchTest {
    public static void main(String[] args) {
        StopWatch stopwatch = new StopWatch();

        stopwatch.start();
        System.out.println("Thoi gian hien tai lan thu 1: " + new Date());
        System.out.println("Bat dau do tai startTime: " + stopwatch.getStartTime());
        System.out.println("pause 5s");
        doSomeThing(5);

        stopwatch.stop();
        System.out.println("Thoi gian hien tai lan thu 2: " + new Date());
        System.out.println("Dung do tai endTime: " + stopwatch.getEndTime());
        System.out.println("Thoi gian troi qua (milisecond): " + stopwatch.getElapsedTime());

        System.out.println("Thoi gian he thong luc bắt đầu đo: " + new Date(stopwatch.getStartTime()));

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
