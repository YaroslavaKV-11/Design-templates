public class SkodaBus extends Bus {
    @Override
    public String getName() {
        return "Skoda Bus";
    }

    @Override
    public double getPurchasePrice() {
        return 4500000;
    }

    @Override
    public double getOperatingCostPerKm() {
        return 25;
    }
}