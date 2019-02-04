package ekkel_generics;

public class Erasure {
    public static void main(String[] args) {
        DerivedErasure de = new DerivedErasure<>();
        Object obj = de.getElement();
        de.setElement(obj);

    }


}

class BasicErasure<T> {
    private T element;

    public T getElement() {

        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }
}

class DerivedErasure<T> extends BasicErasure<T> {

}
