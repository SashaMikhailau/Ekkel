package ekkel_modifiers.ex21;

public interface Interf {
    String f();

    String g();

    class InterInner{
        static void make(Interf interf){
            System.out.println(interf.f());
            System.out.println(interf.g());
        }
    }
}
