package ekkel_generics.factories;

public class WidjetFactory implements Factory<Thread> {
    @Override
    public Thread create(int value) {
        return new Thread("Thread "+value);
    }
}
