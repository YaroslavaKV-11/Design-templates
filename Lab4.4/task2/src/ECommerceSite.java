import java.util.HashMap;

/**
 * Інтернет-магазин як посередник між покупцем і доставкою
 */
public class ECommerceSite implements ShopMediator {
    /**
     * Покупець
     */
    private final Customer customer;

    /**
     * Служба доставлення
     */
    private final Driver driver;

    /**
     * Товари, що наявні в магазині
     */
    private final HashMap<String, Integer> stock;

    public ECommerceSite(Customer customer) {
        this.customer = customer;
        this.driver = new Driver();
        stock = new HashMap<>();
        stock.put("pens", 100);
        stock.put("pencils", 50);
        stock.put("erasers", 75);
    }

    /**
     * Замовлення товару
     * @param item товар
     * @param quantity кількість одиниць товару
     * @return true, якщо замовлення товару пройшло успішно
     */
    @Override
    public boolean checkInStock(String item, int quantity) {
        if (stock.containsKey(item) && stock.get(item) >= quantity) {
            System.out.println(item + " is in stock");
            return true;
        } else {
            System.out.println(item + " is not available in requested quantity");
            return false;
        }
    }

    /**
     * Відвантажити замовлення
     * @param item товар
     * @param quantity кількість одиниць товару
     */
    @Override
    public void sell(String item, int quantity) {
        int newQuantity = stock.get(item) - quantity;
        stock.put(item, newQuantity);
        System.out.println("Order accepted: " + quantity + " " + item);
        driver.deliver(item, quantity, customer);
    }
}