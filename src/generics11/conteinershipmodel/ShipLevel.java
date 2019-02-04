package generics11.conteinershipmodel;

import generics11.Generator;
import generics11.Generators;

import java.util.ArrayList;

public class ShipLevel extends ArrayList<Container> {
    private static long counter;
    private long id = ++counter;
    public ShipLevel(int numberofContainers,int numberOfProducts) {
        for (int i = 0; i < numberofContainers; i++) {
            add(new Container(numberOfProducts));
        }
    }

    @Override
    public String toString() {
        return "ShipLevel №"+id;
    }
}
