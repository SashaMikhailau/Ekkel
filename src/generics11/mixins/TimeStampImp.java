package generics11.mixins;

import generics11.mixins.TimeStamped;

import java.util.Date;

public class TimeStampImp implements TimeStamped {
    public TimeStampImp() {
        this.timeStamp = new Date().getTime();
    }

    private final long timeStamp;
    @Override
    public long getTimeStamp() {
        return timeStamp;
    }
}
