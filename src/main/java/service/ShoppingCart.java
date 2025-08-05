package service;

import model.Food;

public class ShoppingCart {
    private Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    public double getTotalPriceWithoutDiscount() {
        double sum = 0;
        for (int i = 0; i < items.length; i++) {
            sum += items[i].getTotalPrice();
        }
        return sum;
    }

    public double getTotalPriceWithDiscount() {
        double sum = 0;
        for (int i = 0; i < items.length; i++) {
            double discount = items[i].getDiscount();
            sum += items[i].getTotalPrice() * (1 - discount / 100);
        }
        return sum;
    }

    public double getTotalVegetarianPriceWithoutDiscount() {
        double sum = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i].isVegetarian()) {
                sum += items[i].getTotalPrice();
            }
        }
        return sum;
    }
}

