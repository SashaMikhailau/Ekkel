package modifiers.ex21;

import java.util.stream.Stream;

public class Test implements Interf{
    @Override
    public String f() {
        return "f";
    }

    @Override
    public String g() {
        return "g";
    }

    public static void main(String[] args) {
        Interf.InterInner.make(new Test());
        Stream.of("123","456","789").reduce((s1,s2)->s1+String.valueOf(s2.charAt(0))).ifPresent(System.out::println);
    }
}
