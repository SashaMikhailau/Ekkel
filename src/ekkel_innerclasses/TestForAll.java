package ekkel_innerclasses;

import ekkel_innerclasses.single.OuterInterClass;

public class TestForAll extends OuterInterClass {
    InnerInterface doSome(){
        return new InnerInterClass();

    }

    public static void main(String[] args) {
        TestForAll tfa = new TestForAll();
        tfa.doSome().test();
    }

}
