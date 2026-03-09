public interface CoffeeMachineFactory {
    Drink createEspresso();
    Drink createAmericano();
    Drink createCappuccino();
    Drink createLatte();

    String getManufacturerName();
    double getMachinePrice();
    double getDailyServiceCost();
}