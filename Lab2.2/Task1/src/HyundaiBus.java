public class HyundaiBus extends Bus {
    @Override
    public String getName() {
        return "Hyundai Bus";
    }

    @Override
    public double getPurchasePrice() {
        return 5500000;
    }

    @Override
    public double getOperatingCostPerKm() {
        return 20;
    }
}