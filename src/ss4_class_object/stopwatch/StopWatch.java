package ss4_class_object.stopwatch;

import java.util.Date;

public class StopWatch {
    Date startTime,endTime;

    public StopWatch(Date startTime, Date endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }
    Date getStart(){
        return this.startTime;
    }

}
