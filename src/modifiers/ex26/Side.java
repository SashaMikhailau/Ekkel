package modifiers.ex26;

public class Side extends Outer.Inner {
    public Side(int x, int y, Outer outer) {
        outer.super(x, y);
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.new Inner(1, 3);
        OuterSide side = new OuterSide();
        side.new InnerSide(1, 5,outer);
    }
}
