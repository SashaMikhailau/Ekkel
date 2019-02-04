package ekkel_modifiers.ex13;

import ekkel_modifiers.Inter;

public class Outer {
    public Inter get(){
        return new Inter() {
            @Override
            public void test() {
                System.out.println("Inner anonymous class");
            }
        };
    }

    public static void main(String[] args) {
        new Outer().get().test();

    }
}
