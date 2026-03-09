public class VolvoTram extends Tram {
    @Override
    public String getName() {
        return "Volvo Tram";
    }

    @Override
    public double getPurchasePrice() {
        return 10000000;
    }

    @Override
    public double getOperatingCostPerKm() {
        return 7;
    }
}