public class BoschFactory implements CoffeeMachineFactory {
    @Override
    public Drink createEspresso() {
        return new BoschEspresso();
    }

    @Override
    public Drink createAmericano() {
        return new BoschAmericano();
    }

    @Override
    public Drink createCappuccino() {
        return new BoschCappuccino();
    }

    @Override
    public Drink createLatte() {
        return new BoschLatte();
    }

    @Override
    public String getManufacturerName() {
        return "Bosch";
    }

    @Override
    public double getMachinePrice() {
        return 10000.0;
    }

    @Override
    public double getDailyServiceCost() {
        return 120.0;
    }
}