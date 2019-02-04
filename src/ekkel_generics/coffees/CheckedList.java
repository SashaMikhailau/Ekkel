package ekkel_generics.coffees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CheckedList {
    public static<T> void addItemToList(List list) {

        list.add(new Amerocano());
    }
    public static void main(String[] args) {
        List<Capuccino> list = Collections.checkedList(new ArrayList<>(),Capuccino.class);
        addItemToList(list);
        System.out.println(list);
    }

}
