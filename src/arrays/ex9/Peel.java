package arrays.ex9;

import java.util.ArrayList;
import java.util.List;

public class Peel<T> {
    T t;

    public Peel() {

    }

    public void peel(T t){
        this.t = t;
    }
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Peel<Banana> peel = new Peel<>();
        Peel<Banana>[] banana1s;
        Peel<Banana>[] bananas = (Peel<Banana>[])new Peel[5];
        bananas[0] = new Peel<Banana>();
        Object[] objects = bananas;
        objects[0] =  new Peel<String>();
        bananas = (Peel<Banana>[])objects;
        for (Peel<Banana> banana : bananas) {
            if (banana != null) {
            }

        }

        List<Peel<Banana>> peels = new ArrayList<>();
    }
}
