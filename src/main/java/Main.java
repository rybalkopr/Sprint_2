import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Food meat = new Meat(5, 100); // 5 кг мяса по 100 руб
        Food redApples = new Apple(10, 50, Colour.RED); // 10 кг красных яблок по 50 руб
        Food greenApples = new Apple(8, 60, Colour.GREEN); // 8 кг зелёных яблок по 60 руб

        Food[] products = new Food[3];
        products[0] = meat;
        products[1] = redApples;
        products[2] = greenApples;

        ShoppingCart cart = new ShoppingCart(products);

        double totalWithoutDiscount = cart.getTotalPriceWithoutDiscount();
        double totalWithDiscount = cart.getTotalPriceWithDiscount();
        double vegetarianTotal = cart.getTotalVegetarianPriceWithoutDiscount();

        System.out.println("Общая сумма товаров без скидки: " + totalWithoutDiscount);
        System.out.println("Общая сумма товаров со скидкой: " + totalWithDiscount);
        System.out.println("Сумма вегетарианских продуктов без скидки: " + vegetarianTotal);
    }
}

