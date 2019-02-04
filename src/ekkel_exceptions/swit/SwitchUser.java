package ekkel_exceptions.swit;

public class SwitchUser {
    public static Switch sw = new Switch();
    public static void f() throws SwitchException1 {
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        try {
            sw.on();
            f();

        } catch (SwitchException1 e) {

        }
        finally {
            sw.off();
        }
    }
}
