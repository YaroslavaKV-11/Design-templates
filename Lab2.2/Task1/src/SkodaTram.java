public class SkodaTram extends Tram {
    @Override
    public String getName() {
        return "Skoda Tram";
    }

    @Override
    public double getPurchasePrice() {
        return 9000000;
    }

    @Override
    public double getOperatingCostPerKm() {
        return 8;
    }
}