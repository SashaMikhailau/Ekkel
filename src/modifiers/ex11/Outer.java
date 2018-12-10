package modifiers.ex11;

import modifiers.Inter;

public class Outer {
    public Inter get(){
        return new Inner();
    }
    public Inner getInner(){
        return new Inner();
    }
    private class Inner implements Inter {
        @Override
        public void test() {

        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Inner inner = (Inner) outer.get();

    }
}
