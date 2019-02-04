package ekkel_generics.latentTipization;

import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

public class Fill {
    public static <T> void fill(Addable<T> addable, Class<? extends T> type, int size) {
        try {
            for (int i = 0; i < size; i++) {
                addable.add(type.newInstance());

            }
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public static void main(String[] args) {
        LinkedList<Robot> robots = new LinkedList<>();


        fill( Adapter.addableCollection(robots), Robot.class, 10);
        fill( new AddableCollection(robots), Robot.class, 10);
        for (Robot robot : robots) {
            System.out.println(robot);
        }

    }
}
