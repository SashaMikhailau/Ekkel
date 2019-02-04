package ekkel_generics.mixins;

public class Mixin extends BasicImp implements Colored,TimeStamped,SerialNumbered {
    ColorImp coloredImp;
    TimeStamped timeStamped;
    SerialNumbered serialNumbered;

    public Mixin(String color) {
        coloredImp = new ColorImp(color);
        timeStamped = new TimeStampImp();
        serialNumbered = new SerialNumberedImp();
    }

    @Override
    public String getColor() {
        return coloredImp.getColor();
    }

    @Override
    public int getSerial() {
        return serialNumbered.getSerial();
    }

    @Override
    public long getTimeStamp() {
        return timeStamped.getTimeStamp();
    }

    public static void main(String[] args) {
        Mixin mixin = new Mixin("Green");
        System.out.println(mixin.getColor());
        System.out.println(mixin.getSerial());
        System.out.println(mixin.getTimeStamp());

    }
}
