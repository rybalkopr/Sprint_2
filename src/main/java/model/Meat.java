package model;

public class Meat extends Food {

    public Meat(int amount, double price) {
        super(amount, price);
        this.isVegetarian = false;
    }

    // getDiscount() и так 0
}
