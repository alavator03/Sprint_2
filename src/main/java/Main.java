import model.Food;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        // Создаем продукты
        Food meat = new Food("Мясо", 5, 100, false, null);
        Food redApples = new Food("Яблоки красные", 10, 50, true, Colour.RED);
        Food greenApples = new Food("Яблоки зелёные", 8, 60, true, Colour.GREEN);

        // Создаем массив продуктов
        Food[] products = {meat, redApples, greenApples};

        // Инициализируем корзину
        ShoppingCart cart = new ShoppingCart(products);

        // Выводим результаты
        System.out.println("Общая сумма товаров без скидки: " + cart.getTotalPriceWithoutDiscount() + " руб.");
        System.out.println("Общая сумма товаров со скидкой: " + cart.getTotalPriceWithDiscount() + " руб.");
        System.out.println("Сумма всех вегетарианских продуктов без скидки: " + cart.getVegetarianTotalWithoutDiscount() + " руб.");
    }
}