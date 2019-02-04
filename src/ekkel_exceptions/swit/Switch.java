package ekkel_exceptions.swit;

public class Switch {
    private boolean state;

    @Override
    public String toString() {
        return state ? "on" : "off";
    }

    public boolean isState() {
        return state;
    }
    public void on() {
        state = true;
        System.out.println(this);
    }

    public void off() {
        state = false;
        System.out.println(this);
    }
}
