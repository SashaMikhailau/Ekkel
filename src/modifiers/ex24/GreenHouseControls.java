package modifiers.ex24;

import java.util.Arrays;

public class GreenHouseControls extends Controller {
    private boolean light;
    private boolean water;
    private boolean thermostat;
    private boolean ventilation;
   class LightOn extends Event{

        public LightOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            light = true;
        }

        @Override
        public String toString() {
            return "Light On";
        }
    }
    class LightOff extends Event{
        public LightOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            light = false;
        }

        @Override
        public String toString() {
            return "Light Off";
        }
    }

    class WaterOn extends Event{
        public WaterOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public String toString() {
            return "Water On";
        }

        @Override
        public void action() {
            water = true;
        }
    }

     class WaterOff extends Event{

            public WaterOff(long delayTime) {
                super(delayTime);
            }

            @Override
            public void action() {
                water = false;
            }

            @Override
            public String toString() {
                return "Water Off";
            }
        }

        class ThermostatOn extends Event{
            public ThermostatOn(long delayTime) {
                super(delayTime);
            }

            @Override
            public String toString() {
                return "Thermostat On";
            }

            @Override
            public void action() {
                thermostat = true;
            }
        }

        class ThermostatOff extends Event{
            public ThermostatOff(long delayTime) {
                super(delayTime);
            }

            @Override
            public String toString() {
                return "Thermostat Off";
            }

            @Override
            public void action() {
                thermostat = false;
            }
        }
        class VentilationOn extends Event{
            @Override
            public String toString() {
                return "Ventilation On";
            }

            public VentilationOn(long delayTime) {
                super(delayTime);
            }

            @Override
            public void action() {
                ventilation = true;
            }
        }
        class VentilationOff extends Event{
            @Override
            public void action() {
                ventilation = false;
            }

            public VentilationOff(long delayTime) {
                super(delayTime);
            }

            @Override
            public String toString() {
                return "Ventilation Off";
            }

        }

        class Bell extends Event{

            public Bell(long delayTime) {
                super(delayTime);
            }

            @Override
            public void action() {
                start();
                addEvent(this);
            }

            @Override
            public String toString() {
                return "Bellll!!!!";
            }
        }

        public class Restart extends Event{
            private Event[] eventArray;
            public Restart(long delayTime,Event[] eventArray) {
                super(delayTime);
                this.eventArray = eventArray;
                Arrays.stream(eventArray).forEach(e -> addEvent(e));
            }

            @Override
            public String toString() {
                return "Restarting events";
            }

            @Override
            public void action() {
                Arrays.stream(eventArray).forEach(e->{
                    e.start();
                    addEvent(e);
                });
                start();
                addEvent(this);
            }
        }

        public class Termination extends Event{
            public Termination(long delayTime) {
                super(delayTime);
            }

            @Override
            public String toString() {
                return "Termination";
            }

            @Override
            public void action() {
                System.exit(0);

            }
        }
}
