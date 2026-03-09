public class Cappuccino extends Drink {
    @Override
    public String getName() {
        return "Cappuccino";
    }

    @Override
    public double getCostPrice() {
        return 28.0;
    }

    @Override
    public double getSellingPrice() {
        return 60.0;
    }
}