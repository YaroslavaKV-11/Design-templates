public class Latte extends Drink {
    @Override
    public String getName() {
        return "Latte";
    }

    @Override
    public double getCostPrice() {
        return 30.0;
    }

    @Override
    public double getSellingPrice() {
        return 65.0;
    }
}