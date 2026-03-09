public class PhilipsFactory implements CoffeeMachineFactory {
    @Override
    public Drink createEspresso() {
        return new PhilipsEspresso();
    }

    @Override
    public Drink createAmericano() {
        return new PhilipsAmericano();
    }

    @Override
    public Drink createCappuccino() {
        return new PhilipsCappuccino();
    }

    @Override
    public Drink createLatte() {
        return new PhilipsLatte();
    }

    @Override
    public String getManufacturerName() {
        return "Philips";
    }

    @Override
    public double getMachinePrice() {
        return 12000.0;
    }

    @Override
    public double getDailyServiceCost() {
        return 100.0;
    }
}