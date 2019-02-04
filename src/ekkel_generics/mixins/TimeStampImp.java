package ekkel_generics.mixins;

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
