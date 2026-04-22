public interface ShopMediator {
    boolean checkInStock(String item, int quantity);
    void sell(String item, int quantity);
}