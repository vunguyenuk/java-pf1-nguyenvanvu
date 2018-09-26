package OOP;
/*
1. Trường startTime và endTime là private với phương thức getter để trả về giá trị của startTime và endTime.

2. Phương thức khởi tạo không tham số khởi tạo startTime với thời gian hiện tại của hệ thống.

3. Phương thức start() để reset startTime về thời gian hiện tại của hệ thống.

4. Phương thức stop() để thiết đặt endTime về thời gian hiện tại của hệ thống.

5. Phương thức getElapsedTime() trả về thời gian đã trôi qua theo số milisecond giây

6. Vẽ sơ đồ UML cho lớp StopWatch và cài đặt lớp.

7. Viết chương trình đo thời gian thực thi của thuật toán sắp xếp chọn (selection sort) cho 100,000 số.*/


public class StopWatch {
    private long startTime, endTime;

    StopWatch(){
        startTime = System.currentTimeMillis();
    }

    public void start(){
        this.startTime = System.currentTimeMillis();
    }

    public void stop(){
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime(){
       return this.endTime - this.startTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
}
