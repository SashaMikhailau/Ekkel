package ekkel_exceptions.interface_test;

import java.util.*;
import java.util.function.Predicate;

public interface Inter {
    public default void play(){

    }
}

interface Child extends Predicate {
    void play();

}
class Parent implements Inter{
    int x;
    @Override
    public void play() {

    }
    class Inner{
        int x;
       public void play(){
           System.out.println(Parent.this.x);
       }

    }

    public static void main(String[] args) {






    }
    public static void print(List list) {
        list.add(new Parent());
    }
}
