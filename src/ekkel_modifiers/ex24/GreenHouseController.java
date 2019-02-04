package ekkel_modifiers.ex24;

public class GreenHouseController {
    public static void main(String[] args) {
        GreenHouseControls controller = new GreenHouseControls();
        controller.addEvent(controller.new Bell(1000));
        Event[] eventList = {
                controller.new LightOn(0),
                controller.new LightOff(1500),
                controller.new WaterOn(500),
                controller.new WaterOff(2000),
                controller.new VentilationOn(1400),
                controller.new VentilationOff(1600),
                controller.new ThermostatOn(800),
                controller.new ThermostatOff(1400)
        };
        controller.addEvent(controller.new Restart(3000,eventList));
        controller.addEvent(controller.new Termination(5800));
        controller.run();

    }

}
