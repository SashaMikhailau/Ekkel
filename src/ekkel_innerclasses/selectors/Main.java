package ekkel_innerclasses.selectors;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Main {


    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        StringBuilder initial = new StringBuilder("a");
        while (true) {
            if(!sequence.add(new Content(initial.append("a").toString()))){
                break;
            }
        }
        Selector<Content> selector = sequence.selector();
        while (!selector.end()) {
            System.out.println(selector.current());
            selector.next();
        }
        selector = sequence.reverseSelector();
        while (!selector.end()){
            System.out.println(selector.current());
            selector.next();
        }
    }
}
