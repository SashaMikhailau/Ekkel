package ekkel_modifiers.ex23;

import java.util.Arrays;
import java.util.regex.Pattern;

public class B {
    private U[] uArray = new U[5];
    public boolean addU(U u) {
        for (int i = 0; i < uArray.length; i++) {
            if(uArray[i]==null){
                uArray[i] = u;
                return true;
            }
        }
        return false;
    }
    public void removeU(U u){
        for (int i = 0; i < uArray.length; i++) {
            if(uArray[i]==u){
                uArray[i] = null;
                }
        }
    }

    public void callMethods() {
        Arrays.stream(uArray)
                .filter(u -> u != null)
                .forEach(u -> {
                    u.first();
                    u.second();
                    u.third();
                });

    }


    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();
        B b = new B();
        U u1 = a1.getU();
        b.addU(u1);
        b.addU(a2.getU());
        b.addU(a1.getU());
        b.addU(a2.getU());
        b.addU(a3.getU());
        b.removeU(u1);
        b.callMethods();

        System.out.println(Pattern.quote("Baby"));

    }

}
