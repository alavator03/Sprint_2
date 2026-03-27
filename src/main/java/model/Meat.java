package model;

public class Meat extends Food {

    // Конструктор принимает количество и цену
    public Meat(int amount, double price) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = false; // мясо не вегетарианское
    }
}