package ekkel_reflection.ex21_SimpleProxy;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class SimpleProxy {

    static class Proxify implements Interface {
        private Interface proxied;

        public Proxify(Interface proxied) {
            this.proxied = proxied;
        }

        @Override
        public void doSomethig() {
            System.out.println("Proxify do something");
            LocalTime start = LocalTime.now();
            proxied.doSomethig();
            LocalTime end= LocalTime.now();
            System.out.println(ChronoUnit.MILLIS.between(start, end));

        }

        @Override
        public void doSomethingElse(String name) {

            System.out.println("Proxify do something else ("+name+")");
            LocalTime start = LocalTime.now();
            proxied.doSomethingElse(name);
            LocalTime end= LocalTime.now();
            System.out.println(start);
            System.out.println(end);
            System.out.println(ChronoUnit.NANOS.between(start, end));

        }
    }

    public static void consume(Interface inter) {
        inter.doSomethig();
        inter.doSomethingElse("bonobo");
    }

    public static void main(String[] args) {
        consume(new RealObject());
        consume(new Proxify(new RealObject()));
    }

}
