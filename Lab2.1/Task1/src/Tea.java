public class Tea extends Drink {
    @Override
    public String getName() {
        return "Tea";
    }

    @Override
    public double getCostPrice() {
        return 7.0;
    }

    @Override
    public double getSellingPrice() {
        return 30.0;
    }
}