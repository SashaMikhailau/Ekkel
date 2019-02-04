package ekkel_generics.coffees;

public class CaramelDecorator extends Coffee {
    Coffee coffee;

    public CaramelDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String toString() {
        return coffee.toString() + "with Caramel";
    }
}
