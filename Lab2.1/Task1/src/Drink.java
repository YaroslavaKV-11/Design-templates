public abstract class Drink {
    public abstract String getName();
    public abstract double getCostPrice();     
    public abstract double getSellingPrice();  

    public double getProfit() {
        return getSellingPrice() - getCostPrice();
    }
}