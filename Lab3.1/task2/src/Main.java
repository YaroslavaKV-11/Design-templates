import com.vehiclecalculator.CarCalculator;
import com.vehiclecalculator.VehicleCalculator;

public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto(5, "Audi", true, 100_000);

        VehicleCalculator calculator = new CarCalculator();
        CustomsAdapter customs = new CustomsAdapter(calculator, 40.0f);

        float price = customs.vehiclePrice(auto);
        float tax = customs.tax(auto);
        float totalPrice = customs.totalPrice(auto);

        System.out.println("Auto: " + auto);
        System.out.println("Vehicle price in UAH: " + price);
        System.out.println("Tax in UAH: " + tax);
        System.out.println("Total price in UAH: " + totalPrice);
    }
}