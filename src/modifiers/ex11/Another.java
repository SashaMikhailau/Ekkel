package modifiers.ex11;

import modifiers.Inter;

public class Another {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Inter inter = outer.getInner();
    }
}
