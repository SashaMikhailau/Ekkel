package ekkel_generics;

public class InterfaceTask implements InterTask {
    @Override
    public void getH() {
        System.out.println("H");
    }

    @Override
    public void getA() {
        System.out.println("A");
    }

    public void getB(){
        System.out.println("B");
    }
}
