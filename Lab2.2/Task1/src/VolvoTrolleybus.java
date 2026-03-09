public class VolvoTrolleybus extends Trolleybus {
    @Override
    public String getName() {
        return "Volvo Trolleybus";
    }

    @Override
    public double getPurchasePrice() {
        return 7000000;
    }

    @Override
    public double getOperatingCostPerKm() {
        return 13;
    }
}