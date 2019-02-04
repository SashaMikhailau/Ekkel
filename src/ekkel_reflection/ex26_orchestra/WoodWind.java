package ekkel_reflection.ex26_orchestra;

public class WoodWind extends Wind {
    @Override
    public void play() {
        System.out.println("WoodWind play");
    }

    @Override
    protected void clearSplitValve() {
        System.out.println("Woodwind clearvalve");
    }

    @Override
    public void adjust() {
        System.out.println("WoodWind adjust");
    }

    @Override
    public String what() {
        return"WoodWind";
    }
}
