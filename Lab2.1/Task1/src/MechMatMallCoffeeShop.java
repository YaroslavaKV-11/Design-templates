public class MechMatMallCoffeeShop extends CoffeeShop {
    @Override
    public Drink createDrink(String type) {
        if (type.equalsIgnoreCase("espresso")) {
            return new Espresso();
        } else if (type.equalsIgnoreCase("americano")) {
            return new Americano();
        } else if (type.equalsIgnoreCase("cappuccino")) {
            return new Cappuccino();
        } else if (type.equalsIgnoreCase("latte")) {
            return new Latte();
        } else if (type.equalsIgnoreCase("tea")) {
            return new Tea();
        } else if (type.equalsIgnoreCase("hotchocolate")) {
            return new HotChocolate();
        } 
        return null;
    }
}