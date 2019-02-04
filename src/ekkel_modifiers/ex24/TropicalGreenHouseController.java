package ekkel_modifiers.ex24;

public class TropicalGreenHouseController {
    public static void main(String[] args) {
        TropicalGreenHouseControls controls = new TropicalGreenHouseControls();
        controls.addEvent(controls.new Bell(1000));
        Event[] events = {
                controls.new HumiliateOn(100),
                controls.new HumiliateOff(500),
                controls.new VentilationOn(300),
                controls.new VentilationOff(1500),
                controls.new LightOn(0),
                controls.new LightOff(2000)
        };
        controls.addEvent(controls.new Restart(4000,events));
        controls.addEvent(controls.new Termination(10000));
        controls.run();

    }
}
