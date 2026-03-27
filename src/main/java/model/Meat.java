package model;

public class Meat extends Food implements Discountable {
    public Meat(int amount, double price) {
        super(amount, price);
        this.isVegetarian = false; // мясо не вегетарианское
    }

    @Override
    public double getDiscount() {
        return 0; // скидка по умолчанию
    }
}