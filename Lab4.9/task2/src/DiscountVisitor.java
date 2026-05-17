public class DiscountVisitor implements GroceryVisitor {

    private final double discount;

    public DiscountVisitor(double discount) {
        this.discount = discount;
    }

    public void visit(Bread bread) {
        bread.setPrice(bread.getPrice() * (1 - discount));
    }

    public void visit(Milk milk) {
        milk.setPrice(milk.getPrice() * (1 - discount));
    }

    public void visit(Coffee coffee) {
        coffee.setPrice(coffee.getPrice() * (1 - discount));
    }
}