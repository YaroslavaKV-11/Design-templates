public class SkodaTrolleybus extends Trolleybus {
    @Override
    public String getName() {
        return "Skoda Trolleybus";
    }

    @Override
    public double getPurchasePrice() {
        return 6800000;
    }

    @Override
    public double getOperatingCostPerKm() {
        return 12;
    }
}