package model;

public abstract class Food {
    protected int amount;        // количество продукта в килограммах
    protected double price;      // цена за единицу
    protected boolean isVegetarian; // вегетарианский ли продукт

    // Геттеры для доступа к полям
    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }
}