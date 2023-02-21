package ss4_class_object.stopwatch;

import java.time.LocalDateTime;
import java.util.Date;
import java.time.LocalTime;

public class StopWatch {
    long startTime, endTime;

    public StopWatch(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public long getStartTime() {
        return this.startTime;
    }
    public long getEndTime() {
        return this.endTime;
    }
    public void start(){
        this.startTime =System.currentTimeMillis();
    }
    public void stop(){
        this.endTime =System.currentTimeMillis();
    }
    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }

}
