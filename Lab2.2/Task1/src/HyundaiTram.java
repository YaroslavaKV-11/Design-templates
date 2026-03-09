public class HyundaiTram extends Tram {
    @Override
    public String getName() {
        return "Hyundai Tram";
    }

    @Override
    public double getPurchasePrice() {
        return 9500000;
    }

    @Override
    public double getOperatingCostPerKm() {
        return 6;
    }
}