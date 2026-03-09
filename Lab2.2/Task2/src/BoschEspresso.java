public class BoschEspresso extends Drink {
    @Override
    public String getName() {
        return "Bosch Espresso";
    }

    @Override
    public double getCostPrice() {
        return 19.0;
    }

    @Override
    public double getSellingPrice() {
        return 40.0;
    }
}