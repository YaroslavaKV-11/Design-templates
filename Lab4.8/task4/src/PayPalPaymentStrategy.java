public class PayPalPaymentStrategy implements PaymentStrategy {

    public void pay(int amount) {
        System.out.println("Payment of $" + amount + " made from PayPal.");
    }
}