package generics11.mixins;

public class SerialNumberedImp implements SerialNumbered {
    private static int count;
    private final int id = ++count;
    @Override
    public int getSerial() {
        return count;
    }
}
