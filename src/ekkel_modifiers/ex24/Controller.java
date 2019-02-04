package ekkel_modifiers.ex24;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<Event> events = new ArrayList<>();


    public void addEvent(Event e){
        events.add(e);

    }
    public void run(){
        while (events.size()>0){
            new ArrayList<>(events)
                    .stream()
                    .filter(Event::ready)
                    .forEach(e->{
                        System.out.println(e);
                        e.action();
                        events.remove(e);
                    });

            }

        }
    }


