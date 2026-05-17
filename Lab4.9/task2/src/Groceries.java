public interface Groceries {

    double getPrice();

    void accept(GroceryVisitor visitor);
}