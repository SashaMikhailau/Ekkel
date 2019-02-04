package ekkel_generics.latentTipization;

import java.lang.reflect.Method;
import java.util.List;

public class LatentTipization {
    public static  <T, S extends Iterable<T>> void apply(Method m, S sequence, Object... args) {
        try {
            for (T t : sequence) {
                m.invoke(t, args);
            }
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public static void main(String[] args) {
        List<Tiger> tigers = new FilledList<>(Tiger.class, 10);
        List<Robot> robots= new FilledList<>(Robot.class, 5);
        List<Fish> fishes= new FilledList<>(SwordFish.class, 1);

        try {
            apply(Tiger.class.getMethod("sit"),tigers);

            apply(Robot.class.getMethod("sit"),robots);
            apply(Fish.class.getMethod("sit"),fishes);

        } catch (NoSuchMethodException e) {
            System.out.println("These cant sit");
        }

        try {
            apply(Tiger.class.getMethod("eat"),tigers);

            apply(Fish.class.getMethod("eat"),fishes);
            apply(Robot.class.getMethod("eat"),robots);

        } catch (NoSuchMethodException e) {
            System.out.println("These cant eat");
        }

    }

}
