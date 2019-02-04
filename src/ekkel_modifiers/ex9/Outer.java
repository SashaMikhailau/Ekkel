package ekkel_modifiers.ex9;

public class Outer {
    public Inter test(boolean b){
        if(b) {
            class Inner implements Inter {
                int id = 4;

                @Override
                public void one() {

                }
            }
            Inner inner = new Inner();
            return inner;
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(new Outer().test(true).getClass().getName());
    }
}
