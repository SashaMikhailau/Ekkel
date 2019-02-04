package ekkel_modifiers.ex12;

import ekkel_modifiers.Inter;

public class ex12 {
    private int x = 4;
    private void f(){
        System.out.println("method "+x);

    }
    public void x(){
        Inter obj = new Inter() {
            public void test() {
                x = 6;
                f();
            }

        };
        obj.test();
    }

    public static void main(String[] args) {
        new ex12().x();
    }

}
