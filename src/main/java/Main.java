import model.*;
import service.*;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat (5, 100); // Мясо в количестве 5 кг по цене 100 рублей за кг
        Apple appleRed = new Apple (10, 50, "red"); // Яблоки красные в количестве 10 кг по цене 50 рублей
        Apple appleGreen = new Apple (8, 60, "green"); // Яблоки зелёные в количестве 8 кг по цене 60 рублей

        Food[] products = {meat, appleRed, appleGreen};

        ShoppingCart cart = new ShoppingCart(products);

        System.out.println("Общая сумма товаров без скидки: " + cart.withoutDiscount());
        System.out.println("Общая сумма товаров со скидкой: " + cart.withDiscount());
        System.out.println("Сумма всех вегетарианских продуктов без скидки: " + cart.vegetarianWithoutDiscount());
    }
}