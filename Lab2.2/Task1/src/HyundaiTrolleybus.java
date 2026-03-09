public class HyundaiTrolleybus extends Trolleybus {
    @Override
    public String getName() {
        return "Hyundai Trolleybus";
    }

    @Override
    public double getPurchasePrice() {
        return 7000000;
    }

    @Override
    public double getOperatingCostPerKm() {
        return 11;
    }
}