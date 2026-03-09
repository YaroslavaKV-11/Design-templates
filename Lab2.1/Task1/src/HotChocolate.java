public class HotChocolate extends Drink {
    @Override
    public String getName() {
        return "HotChocolate";
    }

    @Override
    public double getCostPrice() {
        return 36.0;
    }

    @Override
    public double getSellingPrice() {
        return 79.0;
    }
}