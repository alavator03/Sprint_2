import model.Meat;
import model.Apple;
import model.service.ShoppingCart;
import model.constants.Colour;

public class Main {
    public static void main(String[] args) {
        // создание продуктов
        Meat meat = new Meat(5, 100.0);
        Apple redApple = new Apple(10, 50.0, Colour.RED);
        Apple greenApple = new Apple(8, 60.0, Colour.GREEN);

        // массив продуктов
        Food[] products = {meat, redApple, greenApple};

        // инициализация корзины
        ShoppingCart cart = new ShoppingCart(products);

        // вывод результатов
        System.out.println("Общая сумма без скидки: " + cart.getTotalWithoutDiscount());
        System.out.println("Общая сумма со скидкой: " + cart.getTotalWithDiscount());
        System.out.println("Сумма вегетарианских продуктов без скидки: " + cart.getVegetarianTotalWithoutDiscount());
    }
}