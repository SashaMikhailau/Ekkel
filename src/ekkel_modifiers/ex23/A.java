package ekkel_modifiers.ex23;

public class A {
    public U getU(){
        return new U() {
            @Override
            public void first() {
                System.out.println("First" + this);
            }

            @Override
            public void second() {
                System.out.println("Second" + this);
            }

            @Override
            public void third() {
                System.out.println("Third" + this);
            }
        };
    }
}
