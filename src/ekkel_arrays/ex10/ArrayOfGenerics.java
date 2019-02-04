package ekkel_arrays.ex10;

import ekkel_arrays.BerilliumSphere;

import java.util.ArrayList;
import java.util.List;

public class ArrayOfGenerics {
    public static void main(String[] args) {
        List<String>[] ls;
        List[] la = new List[10];
        ls = (List<String>[]) la;
        ls[0] = new ArrayList<>();
        Object[] objects = ls;
        objects[1] = new ArrayList<Integer>();

        List<BerilliumSphere>[] array = new ArrayList[5];
        for (int i = 0; i < 5; i++) {
            array[i] = new ArrayList<BerilliumSphere>();
        }
        List<BerilliumSphere> list = new ArrayList<>();
        list.add(new BerilliumSphere());


    }
}
