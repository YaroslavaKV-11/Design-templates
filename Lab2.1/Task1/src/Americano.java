public class Americano extends Drink {
    @Override
    public String getName() {
        return "Americano";
    }

    @Override
    public double getCostPrice() {
        return 22.0;
    }

    @Override
    public double getSellingPrice() {
        return 45.0;
    }
}