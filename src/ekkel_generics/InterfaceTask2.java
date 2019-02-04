package ekkel_generics;

public class InterfaceTask2 {

    public static  <T extends InterTask> void getT(T param) {
        param.getA();
        param.getH();

    }

    public static void main(String[] args) {
        getT(new InterfaceTask());

    }
}
