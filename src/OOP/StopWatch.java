package OOP;
/*
The startTime and endTime fields are private with the getter method to return the values of startTime and endTime.

2. The initialization method does not initialize the startTime parameter with the current system time.

The start () method to reset startTime to the current system time.

4. The stop () method to set endTime to the current time of the system.

The getElapsedTime () method returns the elapsed time in milliseconds

6. Draw the UML diagram for the StopWatch class and install the class.

Write a program to measure the execution time of the selection sort algorithm for 100,000 numbers*/


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
