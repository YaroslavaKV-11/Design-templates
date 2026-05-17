import java.util.ArrayList;
import java.util.List;

public class GroceryList implements Groceries {

    final private List<Groceries> groceries = new ArrayList<>();

    public GroceryList() {
    }

    public void add(Groceries grocery) {
        groceries.add(grocery);
    }

    public double getPrice() {
        double sum = 0.0;

        for (Groceries grocery : groceries) {
            sum += grocery.getPrice();
        }

        return sum;
    }

    public void accept(GroceryVisitor visitor) {
        for (Groceries grocery : groceries) {
            grocery.accept(visitor);
        }
    }
}