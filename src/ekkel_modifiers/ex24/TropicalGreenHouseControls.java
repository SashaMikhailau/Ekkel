package ekkel_modifiers.ex24;

public class TropicalGreenHouseControls extends GreenHouseControls {
    private boolean humiliation;
    class HumiliateOn extends Event{
        @Override
        public String toString() {
            return "Humiliate On";
        }

        public HumiliateOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            humiliation = true;

        }
    }
    class HumiliateOff extends Event{
        public HumiliateOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            humiliation = false;
        }

        @Override
        public String toString() {
            return "HumiliateOff{}";
        }
    }
}
