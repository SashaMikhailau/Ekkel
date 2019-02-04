package ekkel_generics.borders;

import java.io.Console;

public class Border implements Runnable,Flyable {
    @Override
    public void fly() {
        System.out.println("Fly");

    }

    @Override
    public void run() {
        System.out.println("Run");
    }
}
