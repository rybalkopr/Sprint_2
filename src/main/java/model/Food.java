package model;

public abstract class Food {
    protected int amount;
    protected double price;
    protected boolean isVegetarian;

    public Food(int amount, double price) {
        this.amount = amount;
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public double getTotalPrice() {
        return amount * price;
    }

    public double getDiscount() {
        return 0;
    }
}
//test.