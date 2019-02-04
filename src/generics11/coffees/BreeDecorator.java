package generics11.coffees;

public class BreeDecorator extends Coffee {
    Coffee coffee;

    @Override
    public String toString() {
        return coffee.toString() + " with bree";
    }

    public BreeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
}
