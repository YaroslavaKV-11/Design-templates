public class PriceIncreaseVisitor implements GroceryVisitor {

    private final double breadIncrease;

    private final double milkIncrease;

    private final double coffeeIncrease;

    public PriceIncreaseVisitor(double breadIncrease, double milkIncrease, double coffeeIncrease) {
        this.breadIncrease = breadIncrease;
        this.milkIncrease = milkIncrease;
        this.coffeeIncrease = coffeeIncrease;
    }

    public void visit(Bread bread) {
        bread.setPrice(bread.getPrice() + breadIncrease);
    }

    public void visit(Milk milk) {
        milk.setPrice(milk.getPrice() + milkIncrease);
    }

    public void visit(Coffee coffee) {
        coffee.setPrice(coffee.getPrice() + coffeeIncrease);
    }
}