package ekkel_generics.coffees;

public class CreamDecorator extends Coffee {
    Coffee coffee;

    public CreamDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String toString() {
        return coffee.toString()+" with cream";
    }
}
