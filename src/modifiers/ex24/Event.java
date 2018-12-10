package modifiers.ex24;

public abstract class Event {
    private long delayTime;
    private long eventTime;

    public Event(long delayTime) {
        this.delayTime = delayTime;
        start();
    }
    public boolean ready(){
        return System.nanoTime() >= eventTime;
    }
    public void start(){
        eventTime = System.nanoTime() + delayTime*1000000;
    }
    public abstract void action();
}
