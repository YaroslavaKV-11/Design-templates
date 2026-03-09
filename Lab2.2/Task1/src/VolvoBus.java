public class VolvoBus extends Bus {
    @Override
    public String getName() {
        return "Volvo Bus";
    }

    @Override
    public double getPurchasePrice() {
        return 6000000;
    }

    @Override
    public double getOperatingCostPerKm() {
        return 20;
    }
}