package service;

import model.Food;

public class ShoppingCart {

    Food[] basket;

    public ShoppingCart(Food[] basket) {
        this.basket = basket;
    }

    public double withoutDiscount() { // сумма без скидки
        double total = 0;
        for (int i = 0; i < basket.length; i++) {
            total = total + basket[i].getAmount() * basket[i].getPrice();
        }
        return total;
    }

    public double withDiscount() { // сумма со скидкой
        double total = 0;
        for (int i = 0; i < basket.length; i++) {
            double price = basket[i].getAmount() * basket[i].getPrice();
            double discount = basket[i].getDiscount();
            price = price * (1 - discount / 100);
            total = total + price;
        }
        return total;
    }

    public double vegetarianWithoutDiscount() { // сумму всех вегетарианских продуктов в корзине без скидки
        double total = 0;
        for (int i = 0; i < basket.length; i++) {
            if (basket[i].isVegetarian()) {
                total = total + basket[i].getAmount() * basket[i].getPrice();
            }
        }
        return total;
    }
}