package modifiers.ex20;

public class Test implements Inter{
    public static void main(String[] args) {
        Inter.InterInner interInner = new Inter.InterInner();
        interInner.f();
    }
}
