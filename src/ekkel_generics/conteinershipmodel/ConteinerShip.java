package ekkel_generics.conteinershipmodel;

import java.util.ArrayList;

public class ConteinerShip extends ArrayList<ShipLevel> {
    public ConteinerShip(int numberOfLevels, int numberOfConteiners, int numberOfProducts) {
        for (int i = 0; i < numberOfLevels; i++) {
            add(new ShipLevel(numberOfConteiners, numberOfProducts));
        }

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (ShipLevel shipLevel : this) {
            sb.append(shipLevel).append("\n");
            for (Container container : shipLevel) {
                sb.append(container).append("\n");
                for (Product product : container) {
                    sb.append(product).append("\n");
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new ConteinerShip(5,4,3));
    }
}
