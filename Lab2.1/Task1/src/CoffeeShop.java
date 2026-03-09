public abstract class CoffeeShop {
    public abstract Drink createDrink(String type);

    public Drink orderDrink(String type) {
        Drink drink = createDrink(type);

        if (drink != null) {
            System.out.println("Preparing: " + drink.getName());
            System.out.println("Cost price: " + drink.getCostPrice());
            System.out.println("Selling price: " + drink.getSellingPrice());
            System.out.println("Profit from this drink: " + drink.getProfit());
            System.out.println();
        } else {
            System.out.println("Sorry, we don't have this drink: " + type);
            System.out.println();
        }

        return drink;
    }
}