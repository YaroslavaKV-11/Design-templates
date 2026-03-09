public class Main {
    public static void main(String[] args) {
        CoffeeShop shop = new MechMatMallCoffeeShop();

        double totalProfit = 0.0;
        Drink drink;

        drink = shop.orderDrink("espresso");
        if (drink != null) {
            totalProfit += drink.getProfit();
        }

        drink = shop.orderDrink("americano");
        if (drink != null) {
            totalProfit += drink.getProfit();
        }

        drink = shop.orderDrink("cappuccino");
        if (drink != null) {
            totalProfit += drink.getProfit();
        }

        drink = shop.orderDrink("latte");
        if (drink != null) {
            totalProfit += drink.getProfit();
        }

        drink = shop.orderDrink("tea");
        if (drink != null) {
            totalProfit += drink.getProfit();
        }

        drink = shop.orderDrink("hotchocolate");
        if (drink != null) {
            totalProfit += drink.getProfit();
        }

        drink = shop.orderDrink("greentea");
        if (drink != null) {
            totalProfit += drink.getProfit();
        }

        System.out.println("Total profit: " + totalProfit);
    }
}