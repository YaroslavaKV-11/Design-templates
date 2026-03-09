public class DeLonghiFactory implements CoffeeMachineFactory {
    @Override
    public Drink createEspresso() {
        return new DeLonghiEspresso();
    }

    @Override
    public Drink createAmericano() {
        return new DeLonghiAmericano();
    }

    @Override
    public Drink createCappuccino() {
        return new DeLonghiCappuccino();
    }

    @Override
    public Drink createLatte() {
        return new DeLonghiLatte();
    }

    @Override
    public String getManufacturerName() {
        return "DeLonghi";
    }

    @Override
    public double getMachinePrice() {
        return 14000.0;
    }

    @Override
    public double getDailyServiceCost() {
        return 90.0;
    }
}