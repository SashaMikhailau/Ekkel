package ekkel_generics.coffees;

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
