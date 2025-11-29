package model;

public abstract class Food implements Discountable {
    protected int amount; // количество продукта в килограммах (целое число)
    protected double price; // цена за единицу (вещественное число)
    protected boolean isVegetarian; // флаг, который показывает, вегетарианский ли продукт

    protected Food(int amount, double price, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
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
@Override
public double getDiscount() {
    return 0;
}
}