package ekkel_generics;

import java.util.ArrayList;
import java.util.List;

public class GenericCast {
    public static void main(String[] args) {
        int size = 10;
        FixedStack<String> stack = new FixedStack<>(size);
        for (String s : "ABCDEFGHIM".split("")) {
            stack.push(s);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(stack.pop());
        }
    }
}

class FixedStack<T>{
    private int index = 0;
    private int size;
    private List<T> storage;

    public FixedStack(int size) {
        storage = new ArrayList<>(size);
        this.size = size;
    }

    public void push(T t) {
        if (index < size) {
            storage.add(t);
            index++;
        } else throw new RuntimeException();

    }
    public T pop() {
        if (index > 0) {
            return storage.get(--index);
        }
        throw new RuntimeException();
    }

}
