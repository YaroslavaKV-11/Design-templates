public class Espresso extends Drink {
    @Override
    public String getName() {
        return "Espresso";
    }

    @Override
    public double getCostPrice() {
        return 20.0;
    }

    @Override
    public double getSellingPrice() {
        return 40.0;
    }
}