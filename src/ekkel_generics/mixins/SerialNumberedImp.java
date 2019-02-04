package ekkel_generics.mixins;

public class SerialNumberedImp implements SerialNumbered {
    private static int count;
    private final int id = ++count;
    @Override
    public int getSerial() {
        return count;
    }
}
