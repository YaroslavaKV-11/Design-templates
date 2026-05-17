public class Coffee implements Groceries {

    private double price = 3;

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void accept(GroceryVisitor visitor) {
        visitor.visit(this);
    }
}