package ekkel_generics.wildcards;

public class Holder<T> {
    T t;



    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }


    public static void main(String[] args) {
        Holder<Character> characterHolder = new Holder<>();
        Holder<Double> doubleHolder= new Holder<>();
        Holder<Character[]> characterHolder2 = new Holder<>();
        doubleHolder.setT(5.0);
        characterHolder.setT('c');
        System.out.println(characterHolder.getT());
        System.out.println(doubleHolder.getT());

    }


}
