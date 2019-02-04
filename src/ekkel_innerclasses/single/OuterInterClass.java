package ekkel_innerclasses.single;

import ekkel_exceptions.interface_test.Inter;
import ekkel_innerclasses.InnerInterface;

public class OuterInterClass {
    protected class InnerInterClass implements InnerInterface {
        public InnerInterClass() {
        }

        @Override
        public void test() {
            System.out.println(1);
        }
    }
}
