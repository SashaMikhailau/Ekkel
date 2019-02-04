package ekkel_innerclasses.single;

public class Outer {
    private String name = "Outer";
    class Inner{
        @Override
        public String toString() {
            return name;
        }
    }
    public Inner getInner(){
        return new Inner();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.getInner();
        System.out.println(inner);
    }
}
