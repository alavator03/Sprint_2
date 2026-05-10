package model.service;

import model.Food;
import model.Discountable;

public class ShoppingCart {
    private Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    // общая сумма без скидки
    public double getTotalWithoutDiscount() {
        double total = 0;
        for (Food item : items) {
            total += item.getAmount() * item.getPrice();
        }
        return total;
    }

    // общая сумма со скидкой
    public double getTotalWithDiscount() {
        double total = 0;
        for (Food item : items) {
            double itemPrice = item.getAmount() * item.getPrice();
            if (item instanceof Discountable) {
                double discount = ((Discountable) item).getDiscount();
                total += itemPrice * (1 - discount / 100);
            } else {
                total += itemPrice;
            }
        }
        return total;
    }

    // сумма всех вегетарианских продуктов без скидки
    public double getVegetarianTotalWithoutDiscount() {
        double total = 0;
        for (Food item : items) {
            if (item.isVegetarian()) {
                total += item.getAmount() * item.getPrice();
            }
        }
        return total;
    }
}