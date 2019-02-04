package ekkel_modifiers.ex26;

public class OuterSide  {
    class InnerSide extends Outer.Inner{
        public InnerSide(int x, int y,Outer outer) {
            outer.super(x, y);
        }
    }

}
