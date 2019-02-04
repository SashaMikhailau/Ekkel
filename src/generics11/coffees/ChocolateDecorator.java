package generics11.coffees;

import generics11.coffees.Coffee;

public class ChocolateDecorator extends Coffee {
    Coffee coffee;

    @Override
    public String toString() {
        return coffee.toString()+ " with chocolate";
    }

    public ChocolateDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
}
