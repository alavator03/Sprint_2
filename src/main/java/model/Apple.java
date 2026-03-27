package model;

public class Apple extends Food implements Discountable {
    private String colour; // цвет яблок

    // Конструктор принимает количество, цену и цвет
    public Apple(int amount, double price, String colour) {
        this.amount = amount;
        this.price = price;
        this.colour = colour;
        this.isVegetarian = true; // яблоки вегетарианские
    }

    public String getColour() {
        return colour;
    }

    @Override
    public double getDiscount() {
        // Для красных яблок скидка 60%
        if ("red".equalsIgnoreCase(colour)) {
            return 60.0;
        }
        // Для остальных яблок скидка 0%
        return 0.0;
    }
}